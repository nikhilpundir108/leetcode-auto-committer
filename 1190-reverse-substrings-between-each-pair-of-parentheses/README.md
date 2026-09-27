# [1190. Reverse Substrings Between Each Pair of Parentheses](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)

## Difficulty: `Medium` | Topics: `String` `Stack` `Bracket Sequences`

---

## 📝 Problem Statement

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should **not** contain any brackets.

 

**Example 1:**

```
Input: s = "(abcd)"
Output: "dcba"
```

**Example 2:**

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.
```

**Example 3:**

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
```

 

**Constraints:**

	- `1 <= s.length <= 2000`

	- `s` only contains lower case English characters and parentheses.

	- It is guaranteed that all parentheses are balanced.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 3 ms (Beats 66.67%)
- **Memory:** 42.7 MB (Beats 97.78%)
- **Submission Date:** 2026-09-27 12:14:15 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)
