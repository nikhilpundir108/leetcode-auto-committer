# 🚀 Walkthrough: Auto-Sync LeetCode to GitHub

We have implemented an automated Node.js system to sync accepted LeetCode solutions, runtime stats, memory metrics, and problem descriptions directly to GitHub.

---

## 📦 What Was Built

```
c:\Users\Nikhil\Documents\Auto-Sync LeetCode/
├── .github/
│   └── workflows/
│       └── sync.yml          # GitHub Actions workflow (runs every 6 hours & on-demand)
├── .env.example              # Template for credentials (LEETCODE_SESSION, CSRF, GitHub PAT)
├── .gitignore                # Git exclusions (node_modules, .env, OS files)
├── package.json              # Project manifest with scripts (`npm run sync`, `npm test`)
├── sync.js                   # Main sync engine (GraphQL API + Octokit + Local Storage)
├── test.js                   # Automated unit test suite
└── README.md                 # Project landing page & dynamic solutions table template
```

---

## 🌟 Key Features

1. **LeetCode GraphQL Integration**:
   - Authenticates using `LEETCODE_SESSION` & `LEETCODE_CSRF_TOKEN`.
   - Fetches recent accepted submissions (`recentAcSubmissionList`).
   - Retrieves full submission details (code, language, runtime & memory percentiles).
   - Fetches question metadata (frontend ID, title, difficulty, topic tags, and HTML description).

2. **Smart Formatting**:
   - Converts HTML descriptions into clean GitHub-flavored Markdown.
   - Prepends formatted metadata headers (Difficulty, Runtime, Memory, Beats %, Date) to each solution file.
   - Supports 20+ programming languages (Python, JavaScript, TypeScript, Java, C++, Go, Rust, SQL, etc.).

3. **Dual Execution Mode**:
   - **GitHub API Mode**: Uses `@octokit/rest` to commit files directly via GitHub REST API using `GITHUB_TOKEN` and `GITHUB_REPO`.
   - **Local Mode**: Writes files directly to disk when tested locally without remote repo credentials.

4. **Automated Tracking (`progress.json`)**:
   - Tracks synced submissions to prevent duplicate API requests and commits.
   - Generates the root `README.md` dashboard with problem counts, difficulty breakdown, and indexed table.

5. **GitHub Actions Automation**:
   - Scheduled cron (`0 */6 * * *`) every 6 hours + manual dispatch button.

---

## 🧪 Validation & Test Results

The automated test suite (`npm test`) verified all core functions:

```
> node test.js

🧪 Starting Auto-Sync LeetCode Test Suite...

1. Testing padNumber...
✅ padNumber passed.

2. Testing Date formatting...
✅ Date formatting passed.

3. Testing htmlToMarkdown...
✅ htmlToMarkdown passed.

4. Testing buildHeaderComment...
✅ buildHeaderComment passed.

5. Testing generateProblemReadme...
✅ generateProblemReadme passed.

6. Testing generateRootReadme...
✅ generateRootReadme passed.

🎉 ALL TESTS PASSED SUCCESSFULLY! 🚀
```

---

## 🚀 How to Run

### Step 1: Set up credentials in `.env`
Copy `.env.example` to `.env`:
```bash
cp .env.example .env
```
Fill in your `LEETCODE_SESSION` and `LEETCODE_CSRF_TOKEN` cookies from your browser DevTools.

### Step 2: Run the sync
```bash
npm run sync
```

### Step 3: Enable GitHub Actions
Push this repository to GitHub and add `LEETCODE_SESSION` and `LEETCODE_CSRF_TOKEN` to **Settings > Secrets and variables > Actions**.
