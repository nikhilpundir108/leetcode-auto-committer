# [0438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

## Difficulty: `Medium` | Topics: `Hash Table` `String` `Sliding Window`

---

## 📝 Problem Statement

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in **any order**.

 

**Example 1:**

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
```

**Example 2:**

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
```

 

**Constraints:**

	- `1 <= s.length, p.length <= 3 * 10^4`

	- `s` and `p` consist of lowercase English letters.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 59 ms (Beats 24.00%)
- **Memory:** 48 MB (Beats 10.37%)
- **Submission Date:** 2026-10-05 12:35:37 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
