# [0049. Group Anagrams](https://leetcode.com/problems/group-anagrams/)

## Difficulty: `Medium` | Topics: `Array` `Hash Table` `String` `Sorting`

---

## 📝 Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in **any order**.

 

**Example 1:**

**Input:** strs = ["eat","tea","tan","ate","nat","bat"]

**Output:** [["bat"],["nat","tan"],["ate","eat","tea"]]

**Explanation:**

	- There is no string in strs that can be rearranged to form `"bat"`.

	- The strings `"nat"` and `"tan"` are anagrams as they can be rearranged to form each other.

	- The strings `"ate"`, `"eat"`, and `"tea"` are anagrams as they can be rearranged to form each other.

**Example 2:**

**Input:** strs = [""]

**Output:** [[""]]

**Example 3:**

**Input:** strs = ["a"]

**Output:** [["a"]]

 

**Constraints:**

	- `1 <= strs.length <= 10^4`

	- `0 <= strs[i].length <= 100`

	- `strs[i]` consists of lowercase English letters.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 9 ms (Beats 28.54%)
- **Memory:** 49.6 MB (Beats 72.71%)
- **Submission Date:** 2026-09-18 14:03:45 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/group-anagrams/)
