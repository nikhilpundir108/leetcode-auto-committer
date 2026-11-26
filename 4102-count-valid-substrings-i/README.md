# [4102. Count Valid Substrings I](https://leetcode.com/problems/count-valid-substrings-i/)

## Difficulty: `Medium` | Topics: `String` `Enumeration`

---

## 📝 Problem Statement

You are given a string `s` consisting only of the characters `'a'`, `'b'`, and `'c'`.

A string is called **valid** if it does not contain `"abc"` as a **substring**.

Return the number of **valid substrings** in `s`. Substrings with different starting or ending indices are counted separately.

 

**Example 1:**

**Input:** s = "abac"

**Output:** 10

**Explanation:**

The following substrings don't contain `"abc"`​​​​​​​ as a substring:

	- `s[0..0] = "a"`

	- `s[0..1] = "ab"`

	- `s[0..2] = "aba"`

	- `s[0..3] = "abac"`​​​​​​​

	- `s[1..1] = "b"`

	- `s[1..2] = "ba"`

	- `s[1..3] = "bac"`

	- `s[2..2] = "a"`

	- `s[2..3] = "ac"`

	- `s[3..3] = "c"`

Thus, the answer is 10.

**Example 2:**

**Input:** s = "abc"

**Output:** 5

**Explanation:**

The following substrings don't contain `"abc"`​​​​​​​ as a substring:

	- `s[0..0] = "a"`

	- `s[0..1] = "ab"`

	- `s[1..1] = "b"`

	- `s[1..2] = "bc"`

	- `s[2..2] = "c"`​​​​​​​

Thus, the answer is 5.

**Example 3:**

**Input:** s = "ac"

**Output:** 3

**Explanation:**

All substrings in `s` don't contain `"abc"` as a substring​​​​​​​. Thus, the answer is 3.

 

**Constraints:**

	- `1 <= s.length <= 10^5`​​​​​​​

	- `s` only consists of `'a'`, `'b'`, and `'c'` characters.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 12 ms (Beats 96.83%)
- **Memory:** 47.2 MB (Beats 90.15%)
- **Submission Date:** 2026-11-26 12:41:44 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/count-valid-substrings-i/)
