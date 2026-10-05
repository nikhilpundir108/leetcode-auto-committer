# [0856. Score of Parentheses](https://leetcode.com/problems/score-of-parentheses/)

## Difficulty: `Medium` | Topics: `String` `Stack` `Bracket Sequences`

---

## 📝 Problem Statement

Given a balanced parentheses string `s`, return *the **score** of the string*.

The **score** of a balanced parentheses string is based on the following rule:

	- `"()"` has score `1`.

	- `AB` has score `A + B`, where `A` and `B` are balanced parentheses strings.

	- `(A)` has score `2 * A`, where `A` is a balanced parentheses string.

 

**Example 1:**

```
Input: s = "()"
Output: 1
```

**Example 2:**

```
Input: s = "(())"
Output: 2
```

**Example 3:**

```
Input: s = "()()"
Output: 2
```

 

**Constraints:**

	- `2 <= s.length <= 50`

	- `s` consists of only `'('` and `')'`.

	- `s` is a balanced parentheses string.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 42.6 MB (Beats 66.26%)
- **Submission Date:** 2026-10-05 23:54:09 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/score-of-parentheses/)
