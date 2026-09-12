# Implementation Plan: Auto-Sync LeetCode Solutions to GitHub (Node.js)

This plan outlines the design and implementation of a Node.js-based automation script that fetches your successfully accepted LeetCode submissions and commits them to your GitHub repository.

## User Review Required

> [!IMPORTANT]
> - **Credentials Security**: You will need to provide your `LEETCODE_SESSION` and `LEETCODE_CSRF_TOKEN` cookies from your browser, plus a GitHub **Personal Access Token (PAT)** with repository read/write access. These must be stored as secrets in GitHub Actions or locally in a `.env` file, and should **never** be committed to public repositories.
> - **Session Expiration**: LeetCode session cookies expire periodically (usually every few weeks/months). When they do, the script will log an authentication failure, and you will need to update the secrets.

## Proposed Changes

We will create a lightweight Node.js project inside the workspace. The file structure will be:

```
c:\Users\Nikhil\Documents\Auto-Sync LeetCode/
├── .github/
│   └── workflows/
│       └── sync.yml          # GitHub Actions workflow for automated syncs
├── .env.example              # Template for local environment variables
├── .gitignore                # Files to ignore (e.g. node_modules, .env)
├── package.json              # Project dependencies and run script
├── sync.js                   # Main automation script
└── (auto-generated files)
    ├── progress.json         # State tracking of synced submissions
    ├── README.md             # Root repository landing page with solutions table
    └── [problem-folder]/     # Folders per problem (e.g., 0001-two-sum/)
        ├── solution.[ext]    # The source code of your solution
        └── README.md         # Problem details, link, and description
```

---

### Phase 1: Setup and Configuration

#### [NEW] [package.json](file:///c:/Users/Nikhil/Documents/Auto-Sync%20LeetCode/package.json)
Initialize a Node.js project using ES Modules. We'll use:
* `octokit`: Official client for GitHub REST API calls.
* `dotenv`: For local environment variable configuration.
* Native `fetch` (built into Node.js 18+) for lightweight GraphQL queries directly to LeetCode, keeping our dependencies small and stable.

#### [NEW] [.gitignore](file:///c:/Users/Nikhil/Documents/Auto-Sync%20LeetCode/.gitignore)
Standard ignore file containing `node_modules`, `.env`, and IDE/OS files to keep the repository clean.

#### [NEW] [.env.example](file:///c:/Users/Nikhil/Documents/Auto-Sync%20LeetCode/.env.example)
A template showing the required variables:
```env
LEETCODE_SESSION=your_leetcode_session_cookie_value
LEETCODE_CSRF_TOKEN=your_leetcode_csrf_token_value
GITHUB_TOKEN=your_github_pat_token_value
GITHUB_REPO=your_username/your_repo_name
```

---

### Phase 2: Main Script (`sync.js`)

#### [NEW] [sync.js](file:///c:/Users/Nikhil/Documents/Auto-Sync%20LeetCode/sync.js)
The script will perform the following steps sequentially:

1. **Verify Credentials**: Query LeetCode's `userStatus` endpoint. If valid, retrieve the username. If invalid, terminate with a clear auth error message.
2. **Fetch Recent Accepted Solves**: Query LeetCode's `recentAcSubmissionList` endpoint to get the last 20 accepted submissions (title, slug, ID).
3. **Read Synced Log**: Use Octokit to check if `progress.json` exists in the repository. Fetch and parse it to get the list of previously synced submission IDs. If the file doesn't exist, default to an empty list `[]`.
4. **Identify New Solves**: Filter out submissions already present in `progress.json`.
5. **Sync Each Problem**:
   * Fetch submission details for the ID to get the source code, runtime, memory, and language.
   * Query the question content/difficulty using its `titleSlug`.
   * Create/update the solution file (e.g. `0001-two-sum/solution.js`) based on a language-to-extension mapping.
   * Create/update the problem `README.md` with:
     * Problem Title and Link
     * Difficulty level
     * HTML description parsed from the LeetCode content API
     * Metrics (runtime, memory)
   * Commit both files via Octokit.
6. **Update Progress & Index**:
   * Append the new submission IDs to `progress.json` and write/commit the updated JSON to the repo.
   * Regenerate the root `README.md` with an updated markdown table summarizing all solved problems (ID, Title, Difficulty, Language, Date Solved) and commit it.

---

### Phase 3: Automation

#### [NEW] [sync.yml](file:///c:/Users/Nikhil/Documents/Auto-Sync%20LeetCode/.github/workflows/sync.yml)
Create a GitHub Action configured to:
* Trigger on a cron schedule (e.g., every 6 hours).
* Trigger on demand (`workflow_dispatch`).
* Run the node script, supplying secrets as environment variables:
  * `LEETCODE_SESSION`
  * `LEETCODE_CSRF_TOKEN`
  * `GITHUB_TOKEN`
  * `GITHUB_REPO`

---

## Verification Plan

### Automated/Local Tests
* Run the script locally using a test `.env` file (populated with valid user tokens) and a test repository.
* Confirm that:
  * It logs in successfully.
  * It pulls the correct user submissions.
  * It maps languages to files correctly.
  * It writes files locally (for local run) or commits them via Octokit.
  * `progress.json` is updated and subsequent runs skip already-synced solves.

### Manual Verification
* Inspect the target repository to verify:
  * Directory layout is clean and matches `/0001-two-sum/solution.js` structure.
  * Root `README.md` renders the table beautifully.
  * Commits show descriptive messages (e.g., `"Add solution: Two Sum (Easy) — Runtime: 52ms, Memory: 42.5MB"`).
