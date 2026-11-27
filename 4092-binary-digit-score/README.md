# [4092. Binary Digit Score](https://leetcode.com/problems/binary-digit-score/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

You are given two integers `a` and `b`.

Let `s1` and `s2` be the number of **set bits** in the binary representations of `a` and `b`, respectively.

The **score** of these integers is defined as follows:

	- If `s1 >= s2`, the score is `s1 * s2`.

	- Otherwise, the score is `s2 / s1` using integer division.

Return an integer representing the score of `a` and `b`.

 

**Example 1:**

**Input:** a = 14, b = 6

**Output:** 6

**Explanation:**

	- The binary representation of `a = 14` is `"1110"`, so `s1 = 3`.

	- The binary representation of `b = 6` is `"110"`, so `s2 = 2`.

	- Since `s1 > s2`, the score of `a` and `b` is `s1 * s2 = 3 * 2 = 6`.

**Example 2:**

**Input:** a = 5, b = 15

**Output:** 2

**Explanation:**

	- The binary representation of `a = 5` is `"101"`, so `s1 = 2`.

	- The binary representation of `b = 15` is `"1111"`, so `s2 = 4`.

	- Since `s1 

**Example 3:**

**Input:** a = 10, b = 12

**Output:** 4

**Explanation:**

	- The binary representation of `a = 10` is `"1010"`, so `s1 = 2`.

	- The binary representation of `b = 12` is `"1100"`, so `s2 = 2`.

	- Since `s1 == s2`, the score of `a` and `b` is `s1 * s2 = 2 * 2 = 4`.

 

**Constraints:**

	- `1 <= a, b <= 100`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 100.00%)
- **Memory:** 41.9 MB (Beats 85.27%)
- **Submission Date:** 2026-11-27 24:12:36 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/binary-digit-score/)
