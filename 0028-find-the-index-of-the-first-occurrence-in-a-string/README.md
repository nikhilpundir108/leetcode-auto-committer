# [0028. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

## Difficulty: `Easy` | Topics: `Two Pointers` `String` `String Matching` `Z Algorithm` `Knuth–Morris–Pratt Algorithm` `Boyer–Moore String-Search Algorithm`

---

## 📝 Problem Statement

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

 

**Example 1:**

```
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
```

**Example 2:**

```
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
```

 

**Constraints:**

	- `1 <= haystack.length, needle.length <= 10^4`

	- `haystack` and `needle` consist of only lowercase English characters.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 42.8 MB (Beats 81.75%)
- **Submission Date:** 2026-09-15 10:58:47 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)
