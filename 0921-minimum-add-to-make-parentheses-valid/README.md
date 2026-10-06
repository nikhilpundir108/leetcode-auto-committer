# [0921. Minimum Add to Make Parentheses Valid](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)

## Difficulty: `Medium` | Topics: `String` `Stack` `Greedy` `Bracket Sequences`

---

## 📝 Problem Statement

A parentheses string is valid if and only if:

	- It is the empty string,

	- It can be written as `AB` (`A` concatenated with `B`), where `A` and `B` are valid strings, or

	- It can be written as `(A)`, where `A` is a valid string.

You are given a parentheses string `s`. In one move, you can insert a parenthesis at any position of the string.

	- For example, if `s = "()))"`, you can insert an opening parenthesis to be `"(**(**)))"` or a closing parenthesis to be `"())**)**)"`.

Return *the minimum number of moves required to make *`s`* valid*.

 

**Example 1:**

```
Input: s = "())"
Output: 1
```

**Example 2:**

```
Input: s = "((("
Output: 3
```

 

**Constraints:**

	- `1 <= s.length <= 1000`

	- `s[i]` is either `'('` or `')'`.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 42.17%)
- **Memory:** 42.9 MB (Beats 39.71%)
- **Submission Date:** 2026-10-06 14:06:15 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)
