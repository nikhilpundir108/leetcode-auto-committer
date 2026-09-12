import 'dotenv/config';
import fs from 'node:fs/promises';
import path from 'node:path';
import { existsSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import { Octokit } from '@octokit/rest';

// ==============================================================================
// Configuration & Environment Variables
// ==============================================================================
const LEETCODE_SESSION = process.env.LEETCODE_SESSION?.trim();
const LEETCODE_CSRF_TOKEN = (process.env.LEETCODE_CSRF_TOKEN || process.env.CSRFTOKEN)?.trim();
const GITHUB_TOKEN = (process.env.GH_PAT || process.env.GH_TOKEN || process.env.PAT_TOKEN || process.env.GITHUB_TOKEN)?.trim();
const GITHUB_REPO = (process.env.GH_REPO || process.env.TARGET_REPO || process.env.GITHUB_REPO)?.trim(); // e.g. "username/repo"
const SYNC_LIMIT = parseInt(process.env.SYNC_LIMIT || '20', 10);
const FORCE_SYNC = process.env.FORCE_SYNC === 'true';

const PROGRESS_FILE = 'progress.json';
const ROOT_README_FILE = 'README.md';

// ==============================================================================
// Language Mapping: Extensions, Names, and Comment Styles
// ==============================================================================
const LANG_MAP = {
  python: { ext: 'py', comment: '#', name: 'Python' },
  python3: { ext: 'py', comment: '#', name: 'Python 3' },
  javascript: { ext: 'js', comment: '//', name: 'JavaScript' },
  typescript: { ext: 'ts', comment: '//', name: 'TypeScript' },
  java: { ext: 'java', comment: '//', name: 'Java' },
  cpp: { ext: 'cpp', comment: '//', name: 'C++' },
  c: { ext: 'c', comment: '//', name: 'C' },
  csharp: { ext: 'cs', comment: '//', name: 'C#' },
  golang: { ext: 'go', comment: '//', name: 'Go' },
  go: { ext: 'go', comment: '//', name: 'Go' },
  ruby: { ext: 'rb', comment: '#', name: 'Ruby' },
  swift: { ext: 'swift', comment: '//', name: 'Swift' },
  kotlin: { ext: 'kt', comment: '//', name: 'Kotlin' },
  rust: { ext: 'rs', comment: '//', name: 'Rust' },
  php: { ext: 'php', comment: '//', name: 'PHP' },
  scala: { ext: 'scala', comment: '//', name: 'Scala' },
  r: { ext: 'r', comment: '#', name: 'R' },
  mysql: { ext: 'sql', comment: '--', name: 'MySQL' },
  mssql: { ext: 'sql', comment: '--', name: 'MS SQL Server' },
  oraclesql: { ext: 'sql', comment: '--', name: 'Oracle SQL' },
  postgresql: { ext: 'sql', comment: '--', name: 'PostgreSQL' },
  bash: { ext: 'sh', comment: '#', name: 'Bash' },
  dart: { ext: 'dart', comment: '//', name: 'Dart' },
  elixir: { ext: 'ex', comment: '#', name: 'Elixir' },
  erlang: { ext: 'erl', comment: '%', name: 'Erlang' },
  racket: { ext: 'rkt', comment: ';', name: 'Racket' },
};

// ==============================================================================
// Helper Utilities
// ==============================================================================
export function padNumber(num, size = 4) {
  const str = String(num || '0');
  return str.padStart(size, '0');
}

export function formatTimestamp(ts) {
  if (!ts) return new Date().toISOString().split('T')[0];
  const date = typeof ts === 'number' ? (ts > 1e11 ? new Date(ts) : new Date(ts * 1000)) : new Date(ts);
  return date.toISOString().replace('T', ' ').substring(0, 19);
}

export function formatDateOnly(ts) {
  if (!ts) return new Date().toISOString().split('T')[0];
  const date = typeof ts === 'number' ? (ts > 1e11 ? new Date(ts) : new Date(ts * 1000)) : new Date(ts);
  return date.toISOString().split('T')[0];
}

export function htmlToMarkdown(html) {
  if (!html) return '';
  let md = html;
  
  // Format code blocks
  md = md.replace(/<pre[^>]*>\s*<code[^>]*>(.*?)<\/code>\s*<\/pre>/gis, (m, code) => '```\n' + code.replace(/<[^>]+>/g, '').trim() + '\n```\n\n');
  md = md.replace(/<pre[^>]*>(.*?)<\/pre>/gis, (m, code) => '```\n' + code.replace(/<[^>]+>/g, '').trim() + '\n```\n\n');
  
  // Inline styles
  md = md.replace(/<strong[^>]*>(.*?)<\/strong>/gis, '**$1**');
  md = md.replace(/<b[^>]*>(.*?)<\/b>/gis, '**$1**');
  md = md.replace(/<em[^>]*>(.*?)<\/em>/gis, '*$1*');
  md = md.replace(/<i[^>]*>(.*?)<\/i>/gis, '*$1*');
  md = md.replace(/<code[^>]*>(.*?)<\/code>/gis, '`$1`');
  
  // Lists and items
  md = md.replace(/<li[^>]*>(.*?)<\/li>/gis, '- $1\n');
  md = md.replace(/<\/?ul[^>]*>/gis, '\n');
  md = md.replace(/<\/?ol[^>]*>/gis, '\n');
  
  // Paragraphs and breaks
  md = md.replace(/<p[^>]*>(.*?)<\/p>/gis, '$1\n\n');
  md = md.replace(/<br\s*\/?>/gis, '\n');
  md = md.replace(/<sup[^>]*>(.*?)<\/sup>/gis, '^$1');
  md = md.replace(/<sub[^>]*>(.*?)<\/sub>/gis, '_$1');
  
  // HTML Entities
  md = md.replace(/&nbsp;/g, ' ');
  md = md.replace(/&lt;/g, '<');
  md = md.replace(/&gt;/g, '>');
  md = md.replace(/&amp;/g, '&');
  md = md.replace(/&quot;/g, '"');
  md = md.replace(/&#39;/g, "'");
  md = md.replace(/&le;/g, '≤');
  md = md.replace(/&ge;/g, '≥');
  md = md.replace(/&plusmn;/g, '±');
  md = md.replace(/&times;/g, '×');
  md = md.replace(/&divide;/g, '÷');

  // Strip remaining HTML tags
  md = md.replace(/<[^>]+>/g, '');
  
  // Cleanup excessive blank lines
  md = md.replace(/\n{3,}/g, '\n\n');
  return md.trim();
}

export function buildHeaderComment(commentStyle, { title, frontendId, difficulty, langName, runtime, runtimePercentile, memory, memoryPercentile, date, link }) {
  const lines = [
    `Problem: ${title} (LeetCode #${frontendId})`,
    `Difficulty: ${difficulty}`,
    `Language: ${langName}`,
    `Runtime: ${runtime || 'N/A'}${runtimePercentile ? ` (Beats ${Number(runtimePercentile).toFixed(2)}%)` : ''}`,
    `Memory: ${memory || 'N/A'}${memoryPercentile ? ` (Beats ${Number(memoryPercentile).toFixed(2)}%)` : ''}`,
    `Solved At: ${date}`,
    `Link: ${link}`,
  ];

  if (commentStyle === '//' || commentStyle === '/*') {
    return `/*\n * ${lines.join('\n * ')}\n */\n\n`;
  } else if (commentStyle === '#') {
    return lines.map(l => `# ${l}`).join('\n') + '\n\n';
  } else if (commentStyle === '--') {
    return lines.map(l => `-- ${l}`).join('\n') + '\n\n';
  } else if (commentStyle === '%') {
    return lines.map(l => `% ${l}`).join('\n') + '\n\n';
  } else if (commentStyle === ';') {
    return lines.map(l => `; ${l}`).join('\n') + '\n\n';
  }
  return `// ${lines.join('\n// ')}\n\n`;
}

// ==============================================================================
// LeetCode GraphQL Client
// ==============================================================================
export async function leetcodeGraphQL(query, variables = {}) {
  const headers = {
    'content-type': 'application/json',
    'origin': 'https://leetcode.com',
    'referer': 'https://leetcode.com',
    'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36',
  };

  if (LEETCODE_SESSION) {
    headers['cookie'] = `LEETCODE_SESSION=${LEETCODE_SESSION}; csrftoken=${LEETCODE_CSRF_TOKEN || ''};`;
  }
  if (LEETCODE_CSRF_TOKEN) {
    headers['x-csrftoken'] = LEETCODE_CSRF_TOKEN;
  }

  const res = await fetch('https://leetcode.com/graphql', {
    method: 'POST',
    headers,
    body: JSON.stringify({ query, variables }),
  });

  if (!res.ok) {
    throw new Error(`LeetCode API HTTP Error: ${res.status} ${res.statusText}`);
  }

  const result = await res.json();
  if (result.errors && result.errors.length > 0) {
    const errorMsg = result.errors.map(e => e.message).join(', ');
    throw new Error(`LeetCode GraphQL Error: ${errorMsg}`);
  }

  return result.data;
}

// GraphQL Queries
const QUERY_USER_STATUS = `
  query globalData {
    userStatus {
      userId
      isSignedIn
      username
      userSlug
    }
  }
`;

const QUERY_SUBMISSION_LIST = `
  query submissionList($offset: Int!, $limit: Int!, $lastKey: String, $questionSlug: String) {
    submissionList(offset: $offset, limit: $limit, lastKey: $lastKey, questionSlug: $questionSlug) {
      lastKey
      hasNext
      submissions {
        id
        statusDisplay
        lang
        runtime
        timestamp
        url
        isPending
        title
        memory
        titleSlug
      }
    }
  }
`;

const QUERY_RECENT_AC = `
  query recentAcSubmissions($username: String!, $limit: Int!) {
    recentAcSubmissionList(username: $username, limit: $limit) {
      id
      title
      titleSlug
      timestamp
    }
  }
`;

const QUERY_SUBMISSION_DETAILS = `
  query submissionDetails($submissionId: Int!) {
    submissionDetails(submissionId: $submissionId) {
      runtime
      runtimeDisplay
      runtimePercentile
      memory
      memoryDisplay
      memoryPercentile
      code
      timestamp
      statusCode
      lang {
        name
        verboseName
      }
      question {
        questionId
        questionFrontendId
        title
        titleSlug
      }
      notes
      topicTags {
        name
        slug
      }
    }
  }
`;

const QUERY_QUESTION_DATA = `
  query questionData($titleSlug: String!) {
    question(titleSlug: $titleSlug) {
      questionId
      questionFrontendId
      title
      titleSlug
      content
      difficulty
      topicTags {
        name
        slug
      }
      stats
    }
  }
`;

// Helper sleep utility for polite rate-limiting
const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

// ==============================================================================
// State & Storage Manager (Local Filesystem + Octokit Remote Sync)
// ==============================================================================
class StorageManager {
  constructor(octokit, repoOwner, repoName) {
    this.octokit = octokit;
    this.repoOwner = repoOwner;
    this.repoName = repoName;
    this.fileShas = new Map();
    this.octokitDisabled = false;
  }

  async readProgress() {
    if (existsSync(PROGRESS_FILE)) {
      try {
        const raw = await fs.readFile(PROGRESS_FILE, 'utf-8');
        return JSON.parse(raw);
      } catch (err) {
        console.warn('⚠️  Could not parse local progress.json. Initializing new state.');
      }
    }

    if (this.octokit && this.repoOwner && this.repoName && !this.octokitDisabled) {
      try {
        const { data } = await this.octokit.rest.repos.getContent({
          owner: this.repoOwner,
          repo: this.repoName,
          path: PROGRESS_FILE,
        });
        if (data && data.content) {
          this.fileShas.set(PROGRESS_FILE, data.sha);
          const raw = Buffer.from(data.content, 'base64').toString('utf-8');
          return JSON.parse(raw);
        }
      } catch (err) {
        if (err.status !== 404) {
          console.warn(`⚠️  Remote read failed for ${PROGRESS_FILE}: ${err.message}`);
        }
      }
    }

    return {
      lastSyncedAt: null,
      totalSolved: 0,
      solvedProblems: {},
      syncedSubmissionIds: [],
    };
  }

  async saveFile(filePath, content, commitMessage = '') {
    const normalizedPath = filePath.replace(/\\/g, '/');

    // 1. Always write locally if working directory allows
    try {
      const dir = path.dirname(normalizedPath);
      if (dir && dir !== '.') {
        await fs.mkdir(dir, { recursive: true });
      }
      await fs.writeFile(normalizedPath, content, 'utf-8');
    } catch (err) {
      console.warn(`⚠️  Failed writing local file ${normalizedPath}: ${err.message}`);
    }

    // 2. Commit to GitHub API if Octokit is configured
    if (this.octokit && this.repoOwner && this.repoName && !this.octokitDisabled) {
      try {
        let sha = this.fileShas.get(normalizedPath);
        if (!sha) {
          try {
            const { data } = await this.octokit.rest.repos.getContent({
              owner: this.repoOwner,
              repo: this.repoName,
              path: normalizedPath,
            });
            if (data && data.sha) {
              sha = data.sha;
            }
          } catch (err) {
            // File does not exist yet remotely
          }
        }

        const res = await this.octokit.rest.repos.createOrUpdateFileContents({
          owner: this.repoOwner,
          repo: this.repoName,
          path: normalizedPath,
          message: commitMessage || `Sync: Update ${normalizedPath}`,
          content: Buffer.from(content).toString('base64'),
          sha: sha || undefined,
        });

        if (res.data?.content?.sha) {
          this.fileShas.set(normalizedPath, res.data.content.sha);
        }
      } catch (err) {
        if (err.status === 401 || err.status === 403 || err.message?.includes('Resource not accessible')) {
          console.warn(`⚠️  GitHub API access denied (${err.message}). Continuing in Local Filesystem Mode.`);
          this.octokitDisabled = true;
        } else {
          console.error(`❌ GitHub API commit failed for ${normalizedPath}: ${err.message}`);
        }
      }
    }
  }
}

// ==============================================================================
// Root README Table Generator
// ==============================================================================
export function generateRootReadme(progress) {
  const problems = Object.values(progress.solvedProblems || {}).sort((a, b) => {
    return parseInt(a.frontendId, 10) - parseInt(b.frontendId, 10);
  });

  const total = problems.length;
  const easyCount = problems.filter(p => p.difficulty?.toLowerCase() === 'easy').length;
  const mediumCount = problems.filter(p => p.difficulty?.toLowerCase() === 'medium').length;
  const hardCount = problems.filter(p => p.difficulty?.toLowerCase() === 'hard').length;

  const difficultyBadge = (diff) => {
    switch (diff?.toLowerCase()) {
      case 'easy': return '`🟢 Easy`';
      case 'medium': return '`🟡 Medium`';
      case 'hard': return '`🔴 Hard`';
      default: return `\`${diff || 'Unknown'}\``;
    }
  };

  let tableRows = '';
  for (const prob of problems) {
    const paddedId = padNumber(prob.frontendId);
    const probLink = `https://leetcode.com/problems/${prob.titleSlug}/`;
    
    // Deduplicate solution links by language
    const seenLangs = new Set();
    const solLinksList = [];
    for (const s of (prob.submissions || [])) {
      const langKey = (s.language || 'code').toLowerCase();
      if (!seenLangs.has(langKey)) {
        seenLangs.add(langKey);
        const solPath = `./${prob.directory}/${s.file || 'solution.js'}`;
        const langName = LANG_MAP[s.language]?.name || s.language || 'Code';
        solLinksList.push(`[${langName}](${solPath})`);
      }
    }
    const solLinks = solLinksList.join(', ');

    const latestSub = prob.submissions?.[prob.submissions.length - 1] || {};
    const runtime = latestSub.runtime || 'N/A';
    const memory = latestSub.memory || 'N/A';
    const date = formatDateOnly(latestSub.timestamp);

    tableRows += `| ${paddedId} | [${prob.title}](${probLink}) | ${solLinks || '-'} | ${difficultyBadge(prob.difficulty)} | ${runtime} | ${memory} | ${date} |\n`;
  }

  return `# 🚀 Auto-Sync LeetCode Solutions

[![LeetCode Auto-Sync](https://img.shields.io/badge/LeetCode-Auto--Sync-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](https://leetcode.com)
[![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-Automated-2088FF?style=for-the-badge&logo=githubactions&logoColor=white)](https://github.com/features/actions)

> ⚡ Automatically synced LeetCode solutions, runtime stats, and problem descriptions powered by Node.js & GitHub Actions.

---

## 📊 Summary & Statistics

| 🎯 Total Solved | 🟢 Easy | 🟡 Medium | 🔴 Hard | 🕒 Last Synced |
|:---:|:---:|:---:|:---:|:---:|
| **${total}** | **${easyCount}** | **${mediumCount}** | **${hardCount}** | **${progress.lastSyncedAt ? formatTimestamp(progress.lastSyncedAt) : 'Never'}** |

---

## 📑 Solutions Index

| # | Title | Solution | Difficulty | Runtime | Memory | Solved Date |
|:---:|:---|:---:|:---:|:---:|:---:|:---:|
${tableRows || '| - | No solutions synced yet | - | - | - | - | - |\n'}
---

### ⚙️ How It Works
1. Runs automatically via **GitHub Actions** on a schedule (every 6 hours) or on-demand.
2. Authenticates with LeetCode via session cookies and queries accepted submissions.
3. Automatically generates structured problem folders, clean markdown descriptions, and code solutions with performance metrics.
4. Keeps track of synced solves in \`progress.json\` to prevent duplicate commits.
`;
}

// ==============================================================================
// Problem Directory README Generator
// ==============================================================================
export function generateProblemReadme({ frontendId, title, titleSlug, difficulty, topicTags, contentHtml, submission }) {
  const paddedId = padNumber(frontendId);
  const problemUrl = `https://leetcode.com/problems/${titleSlug}/`;
  const tagsStr = (topicTags || []).map(t => `\`${t.name}\``).join(' ') || '`None`';
  const cleanDescription = htmlToMarkdown(contentHtml) || 'Problem statement could not be fetched.';

  const langName = LANG_MAP[submission.lang]?.name || submission.lang || 'Unknown';
  const runtimeDisplay = `${submission.runtime || 'N/A'}${submission.runtimePercentile ? ` (Beats ${Number(submission.runtimePercentile).toFixed(2)}%)` : ''}`;
  const memoryDisplay = `${submission.memory || 'N/A'}${submission.memoryPercentile ? ` (Beats ${Number(submission.memoryPercentile).toFixed(2)}%)` : ''}`;
  const dateDisplay = formatTimestamp(submission.timestamp);

  return `# [${paddedId}. ${title}](${problemUrl})

## Difficulty: \`${difficulty}\` | Topics: ${tagsStr}

---

## 📝 Problem Statement

${cleanDescription}

---

## 📈 Submission Details

- **Language:** ${langName}
- **Runtime:** ${runtimeDisplay}
- **Memory:** ${memoryDisplay}
- **Submission Date:** ${dateDisplay}
- **LeetCode Link:** [View Problem](${problemUrl})
`;
}

// ==============================================================================
// Submission Fetcher with Pagination Support
// ==============================================================================
async function fetchAllAcceptedSubmissions({ username, syncedIdsSet, forceSync }) {
  const pageSize = 20;
  let offset = 0;
  let hasNext = true;
  let lastKey = null;
  const acceptedSubmissions = [];

  console.log(`📥 Fetching submissions with pagination from LeetCode...`);

  while (hasNext) {
    try {
      const res = await leetcodeGraphQL(QUERY_SUBMISSION_LIST, { offset, limit: pageSize, lastKey });
      const data = res?.submissionList;

      if (!data || !data.submissions || data.submissions.length === 0) {
        break;
      }

      const submissions = data.submissions;
      let newAcceptedInPage = 0;

      for (const sub of submissions) {
        if (sub.statusDisplay === 'Accepted') {
          acceptedSubmissions.push(sub);
          if (!syncedIdsSet.has(String(sub.id))) {
            newAcceptedInPage++;
          }
        }
      }

      console.log(`   Page (offset ${offset}): Retrieved ${submissions.length} submissions (${newAcceptedInPage} new accepted).`);

      hasNext = data.hasNext;
      lastKey = data.lastKey;
      offset += pageSize;

      // Incremental optimization: If not force syncing and all accepted submissions in this page are already synced, we can stop pagination early
      if (!forceSync && syncedIdsSet.size > 0 && newAcceptedInPage === 0 && offset > 40) {
        console.log(`   ⏹️ Reached previously synced submissions. Stopping pagination.`);
        break;
      }

      // Small pause between pages
      await sleep(200);
    } catch (err) {
      console.warn(`⚠️  Paginated query failed at offset ${offset}: ${err.message}`);
      // Fallback to recent submissions query if submissionList query encounters an issue
      if (acceptedSubmissions.length === 0) {
        console.log('   Falling back to recentAcSubmissionList query...');
        try {
          const fallbackData = await leetcodeGraphQL(QUERY_RECENT_AC, { username, limit: 20 });
          return fallbackData.recentAcSubmissionList || [];
        } catch (fbErr) {
          console.error(`❌ Fallback query also failed: ${fbErr.message}`);
        }
      }
      break;
    }
  }

  return acceptedSubmissions;
}

// ==============================================================================
// Main Sync Engine
// ==============================================================================
export async function runSync() {
  console.log('='.repeat(60));
  console.log('🔄 Starting LeetCode Auto-Sync Engine');
  console.log('='.repeat(60));

  // 1. Validate Credentials
  if (!LEETCODE_SESSION) {
    console.error('❌ Missing LEETCODE_SESSION!');
    console.error('👉 Please configure your LEETCODE_SESSION cookie in .env or GitHub Secrets.');
    console.error('   See .env.example for step-by-step instructions.');
    process.exit(1);
  }

  let octokit = null;
  let repoOwner = '';
  let repoName = '';

  if (GITHUB_TOKEN && GITHUB_REPO) {
    // Sanitize repository input (handles "owner/repo", "https://github.com/owner/repo", "git@github.com:owner/repo.git")
    let cleanRepo = GITHUB_REPO.replace(/\.git$/i, '').replace(/^https?:\/\/github\.com\//i, '').replace(/^git@github\.com:/i, '').trim();
    const parts = cleanRepo.split('/');
    if (parts.length === 2 && parts[0] && parts[1]) {
      repoOwner = parts[0];
      repoName = parts[1];
      octokit = new Octokit({ auth: GITHUB_TOKEN });
      console.log(`📡 GitHub API Mode enabled for repo: ${repoOwner}/${repoName}`);
    } else {
      console.warn(`⚠️  Invalid GITHUB_REPO format "${GITHUB_REPO}". Expected "username/repo-name". Using Local Mode.`);
    }
  } else {
    console.log('💻 Local Filesystem Mode enabled (No GitHub PAT or Repo configured).');
  }

  const storage = new StorageManager(octokit, repoOwner, repoName);

  // 2. Verify LeetCode User Authentication
  console.log('🔑 Authenticating with LeetCode...');
  let userStatus;
  try {
    const data = await leetcodeGraphQL(QUERY_USER_STATUS);
    userStatus = data.userStatus;
  } catch (err) {
    console.error(`❌ Authentication check failed: ${err.message}`);
    process.exit(1);
  }

  if (!userStatus?.isSignedIn || !userStatus?.username) {
    console.error('❌ LeetCode session is invalid or expired.');
    console.error('👉 Please refresh your LEETCODE_SESSION and LEETCODE_CSRF_TOKEN cookies.');
    process.exit(1);
  }

  const username = userStatus.username;
  console.log(`✅ Logged in as LeetCode user: @${username}`);

  // 3. Load Progress State
  const progress = await storage.readProgress();
  if (!progress.syncedSubmissionIds) progress.syncedSubmissionIds = [];
  if (!progress.solvedProblems) progress.solvedProblems = {};

  const syncedIdsSet = new Set(progress.syncedSubmissionIds.map(String));

  // 4. Fetch All Accepted Submissions (with pagination)
  const allAccepted = await fetchAllAcceptedSubmissions({
    username,
    syncedIdsSet,
    forceSync: FORCE_SYNC,
  });

  console.log(`📋 Found ${allAccepted.length} total accepted submission(s) across all pages.`);
  if (allAccepted.length === 0) {
    console.log('✨ No accepted submissions found. All done!');
    return;
  }

  // 5. Filter Unsynced Submissions
  const toSync = allAccepted.filter(sub => FORCE_SYNC || !syncedIdsSet.has(String(sub.id)));
  console.log(`🎯 Found ${toSync.length} new submission(s) to process.`);

  if (toSync.length === 0) {
    console.log('✨ All submissions are already synced and up to date!');
    return;
  }

  // Process submissions in chronological order (oldest to newest)
  toSync.reverse();

  let newlySyncedCount = 0;

  for (let i = 0; i < toSync.length; i++) {
    const item = toSync[i];
    const subId = parseInt(item.id, 10);
    const progressLabel = `[${i + 1}/${toSync.length}]`;
    console.log(`\n------------------------------------------------------------`);
    console.log(`${progressLabel} 🔍 Processing submission #${subId} (${item.title || item.titleSlug})...`);

    // Polite rate limiting between question fetches
    await sleep(250);

    let subDetails = null;
    try {
      const detailsData = await leetcodeGraphQL(QUERY_SUBMISSION_DETAILS, { submissionId: subId });
      subDetails = detailsData.submissionDetails;
    } catch (err) {
      console.warn(`⚠️  Could not fetch submission details for #${subId}: ${err.message}`);
      continue;
    }

    if (!subDetails || !subDetails.code) {
      console.warn(`⚠️  Empty code or details for submission #${subId}. Skipping.`);
      continue;
    }

    // Fetch Question Details (Difficulty, HTML content, tags)
    const titleSlug = item.titleSlug || subDetails.question?.titleSlug;
    let questionData = null;
    try {
      await sleep(150);
      const qData = await leetcodeGraphQL(QUERY_QUESTION_DATA, { titleSlug });
      questionData = qData.question;
    } catch (err) {
      console.warn(`⚠️  Could not fetch question content for "${titleSlug}": ${err.message}`);
    }

    const frontendId = questionData?.questionFrontendId || subDetails.question?.questionFrontendId || '0';
    const problemTitle = questionData?.title || subDetails.question?.title || item.title;
    const difficulty = questionData?.difficulty || 'Unknown';
    const topicTags = questionData?.topicTags || subDetails.topicTags || [];
    const contentHtml = questionData?.content || '';

    const langKey = (subDetails.lang?.name || item.lang || 'javascript').toLowerCase();
    const langInfo = LANG_MAP[langKey] || { ext: 'txt', comment: '//', name: subDetails.lang?.verboseName || langKey };

    const paddedId = padNumber(frontendId);
    const dirName = `${paddedId}-${titleSlug}`;
    const solFileName = `solution.${langInfo.ext}`;
    const solFilePath = `${dirName}/${solFileName}`;
    const readmeFilePath = `${dirName}/README.md`;
    const problemUrl = `https://leetcode.com/problems/${titleSlug}/`;

    // 1. Build Solution File Content with Metadata Header
    const formattedDate = formatTimestamp(subDetails.timestamp || item.timestamp);
    const headerComment = buildHeaderComment(langInfo.comment, {
      title: problemTitle,
      frontendId,
      difficulty,
      langName: langInfo.name,
      runtime: subDetails.runtimeDisplay || subDetails.runtime || item.runtime,
      runtimePercentile: subDetails.runtimePercentile,
      memory: subDetails.memoryDisplay || subDetails.memory || item.memory,
      memoryPercentile: subDetails.memoryPercentile,
      date: formattedDate,
      link: problemUrl,
    });

    const solutionCode = headerComment + subDetails.code;

    // 2. Build Problem README Content
    const problemReadme = generateProblemReadme({
      frontendId,
      title: problemTitle,
      titleSlug,
      difficulty,
      topicTags,
      contentHtml,
      submission: {
        lang: langKey,
        runtime: subDetails.runtimeDisplay || subDetails.runtime || item.runtime,
        runtimePercentile: subDetails.runtimePercentile,
        memory: subDetails.memoryDisplay || subDetails.memory || item.memory,
        memoryPercentile: subDetails.memoryPercentile,
        timestamp: subDetails.timestamp || item.timestamp,
      },
    });

    // 3. Save Files & Commit
    const commitMsg = `Add solution: ${problemTitle} (#${paddedId}) [${difficulty}] - ${langInfo.name}`;
    console.log(`💾 Saving solution: ${solFilePath}`);
    await storage.saveFile(solFilePath, solutionCode, commitMsg);

    console.log(`📄 Saving problem doc: ${readmeFilePath}`);
    await storage.saveFile(readmeFilePath, problemReadme, `Update problem README: ${problemTitle} (#${paddedId})`);

    // 4. Update Progress State
    if (!progress.solvedProblems[paddedId]) {
      progress.solvedProblems[paddedId] = {
        frontendId,
        title: problemTitle,
        titleSlug,
        difficulty,
        directory: dirName,
        submissions: [],
      };
    }

    const existingSubIdx = progress.solvedProblems[paddedId].submissions.findIndex(s => String(s.submissionId) === String(subId));
    const subRecord = {
      submissionId: String(subId),
      language: langKey,
      file: solFileName,
      runtime: subDetails.runtimeDisplay || `${subDetails.runtime || item.runtime || 'N/A'}`,
      runtimePercentile: subDetails.runtimePercentile ? `${Number(subDetails.runtimePercentile).toFixed(2)}%` : null,
      memory: subDetails.memoryDisplay || `${subDetails.memory || item.memory || 'N/A'}`,
      memoryPercentile: subDetails.memoryPercentile ? `${Number(subDetails.memoryPercentile).toFixed(2)}%` : null,
      timestamp: subDetails.timestamp || item.timestamp,
    };

    if (existingSubIdx >= 0) {
      progress.solvedProblems[paddedId].submissions[existingSubIdx] = subRecord;
    } else {
      progress.solvedProblems[paddedId].submissions.push(subRecord);
    }

    if (!syncedIdsSet.has(String(subId))) {
      progress.syncedSubmissionIds.push(String(subId));
      syncedIdsSet.add(String(subId));
    }

    newlySyncedCount++;
    console.log(`✅ Successfully synced: ${problemTitle} (#${paddedId})`);
  }

  // 6. Update Progress and Root README
  progress.totalSolved = Object.keys(progress.solvedProblems).length;
  progress.lastSyncedAt = new Date().toISOString();

  console.log(`\n============================================================`);
  console.log(`📊 Updating ${PROGRESS_FILE} and ${ROOT_README_FILE}...`);

  await storage.saveFile(PROGRESS_FILE, JSON.stringify(progress, null, 2), `Update sync progress [${progress.totalSolved} solved]`);

  const rootReadmeContent = generateRootReadme(progress);
  await storage.saveFile(ROOT_README_FILE, rootReadmeContent, `Update root README index [${progress.totalSolved} solved]`);

  console.log('='.repeat(60));
  console.log(`🎉 Sync Completed! Successfully synced ${newlySyncedCount} submission(s).`);
  console.log(`📚 Total Solved Problems: ${progress.totalSolved}`);
  console.log('='.repeat(60));
}

// Execute when run directly
const isMain = process.argv[1] && fileURLToPath(import.meta.url).toLowerCase() === path.resolve(process.argv[1]).toLowerCase();
if (isMain) {
  runSync().catch(err => {
    console.error('💥 Fatal sync error:', err);
    process.exit(1);
  });
}

