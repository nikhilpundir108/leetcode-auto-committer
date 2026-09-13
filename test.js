import assert from 'node:assert/strict';
import {
  padNumber,
  formatTimestamp,
  formatDateOnly,
  htmlToMarkdown,
  buildHeaderComment,
  generateProblemReadme,
  generateRootReadme
} from './sync.js';

console.log('🧪 Starting Auto-Sync LeetCode Test Suite...\n');

// Test 1: Number padding
console.log('1. Testing padNumber...');
assert.equal(padNumber('1'), '0001');
assert.equal(padNumber(42), '0042');
assert.equal(padNumber('1337'), '1337');
assert.equal(padNumber(12345), '12345');
console.log('✅ padNumber passed.');

// Test 2: Timestamp and Date formatting
console.log('\n2. Testing Date formatting...');
const ts = 1694563200; // 2023-09-13
const dateStr = formatDateOnly(ts);
assert.equal(dateStr, '2023-09-13');
const fullTs = formatTimestamp(ts);
assert.match(fullTs, /^2023-09-13 \d{2}:\d{2}:\d{2} IST$/);
console.log('✅ Date formatting passed.');

// Test 3: HTML to Markdown conversion
console.log('\n3. Testing htmlToMarkdown...');
const testHtml = `
<p>Given an array of integers <code>nums</code> and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>
<p>You may assume that each input would have <strong>exactly one solution</strong>, and you may not use the <em>same</em> element twice.</p>
<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>
<p><strong>Constraints:</strong></p>
<ul>
  <li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
  <li><code>-10<sup>9</sup> &le; nums[i] &le; 10<sup>9</sup></code></li>
  <li><code>-10<sup>9</sup> &le; target &le; 10<sup>9</sup></code></li>
  <li><strong>Only one valid answer exists.</strong></li>
</ul>
`;

const markdown = htmlToMarkdown(testHtml);
assert.ok(markdown.includes('`nums`'));
assert.ok(markdown.includes('**exactly one solution**'));
assert.ok(markdown.includes('```'));
assert.ok(markdown.includes('2 <= nums.length <= 10^4'));
assert.ok(markdown.includes('-10^9 ≤ nums[i] ≤ 10^9'));
console.log('✅ htmlToMarkdown passed.');

// Test 4: Header Comment Generation
console.log('\n4. Testing buildHeaderComment...');
const jsHeader = buildHeaderComment('//', {
  title: 'Two Sum',
  frontendId: '1',
  difficulty: 'Easy',
  langName: 'JavaScript',
  runtime: '52 ms',
  runtimePercentile: 85.2,
  memory: '42.5 MB',
  memoryPercentile: 78.4,
  date: '2026-09-13 03:30:00',
  link: 'https://leetcode.com/problems/two-sum/',
});
assert.ok(jsHeader.startsWith('/*'));
assert.ok(jsHeader.includes('Problem: Two Sum (LeetCode #1)'));
assert.ok(jsHeader.includes('Beats 85.20%'));
assert.ok(jsHeader.endsWith('*/\n\n'));

const pyHeader = buildHeaderComment('#', {
  title: 'Two Sum',
  frontendId: '1',
  difficulty: 'Easy',
  langName: 'Python 3',
  runtime: '48 ms',
  runtimePercentile: 89.1,
  memory: '17.2 MB',
  memoryPercentile: 65.0,
  date: '2026-09-13 03:30:00',
  link: 'https://leetcode.com/problems/two-sum/',
});
assert.ok(pyHeader.startsWith('# Problem: Two Sum'));
assert.ok(pyHeader.includes('# Difficulty: Easy'));
console.log('✅ buildHeaderComment passed.');

// Test 5: Problem README Generation
console.log('\n5. Testing generateProblemReadme...');
const probReadme = generateProblemReadme({
  frontendId: '1',
  title: 'Two Sum',
  titleSlug: 'two-sum',
  difficulty: 'Easy',
  topicTags: [{ name: 'Array', slug: 'array' }, { name: 'Hash Table', slug: 'hash-table' }],
  contentHtml: '<p>Problem text</p>',
  submission: {
    lang: 'javascript',
    runtime: '52 ms',
    runtimePercentile: 85.2,
    memory: '42.5 MB',
    memoryPercentile: 78.4,
    timestamp: 1694563200,
  }
});
assert.ok(probReadme.includes('# [0001. Two Sum](https://leetcode.com/problems/two-sum/)'));
assert.ok(probReadme.includes('`Array` `Hash Table`'));
assert.ok(probReadme.includes('Beats 85.20%'));
console.log('✅ generateProblemReadme passed.');

// Test 6: Root README Generation
console.log('\n6. Testing generateRootReadme...');
const mockProgress = {
  lastSyncedAt: '2026-09-13T03:30:00.000Z',
  totalSolved: 1,
  solvedProblems: {
    '0001': {
      frontendId: '1',
      title: 'Two Sum',
      titleSlug: 'two-sum',
      difficulty: 'Easy',
      directory: '0001-two-sum',
      submissions: [
        {
          submissionId: '12345678',
          language: 'javascript',
          file: 'solution.js',
          runtime: '52 ms',
          memory: '42.5 MB',
          timestamp: 1694563200,
        }
      ]
    }
  }
};

const rootReadme = generateRootReadme(mockProgress);
assert.ok(rootReadme.includes('Total Solved | 🟢 Easy'));
assert.ok(rootReadme.includes('| **1** | **1** | **0** | **0** |'));
assert.ok(rootReadme.includes('| 0001 | [Two Sum](https://leetcode.com/problems/two-sum/) | [JavaScript](./0001-two-sum/solution.js) | `🟢 Easy` | 52 ms | 42.5 MB | 2023-09-13 |'));
console.log('✅ generateRootReadme passed.');

console.log('\n🎉 ALL TESTS PASSED SUCCESSFULLY! 🚀');
