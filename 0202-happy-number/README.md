# [0202. Happy Number](https://leetcode.com/problems/happy-number/)

## Difficulty: `Easy` | Topics: `Hash Table` `Math` `Two Pointers` `Floyd's Cycle Finding Algorithm`

---

## 📝 Problem Statement

Write an algorithm to determine if a number `n` is happy.

A **happy number** is a number defined by the following process:

	- Starting with any positive integer, replace the number by the sum of the squares of its digits.

	- Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.

	- Those numbers for which this process **ends in 1** are happy.

Return `true` *if* `n` *is a happy number, and* `false` *if not*.

 

**Example 1:**

```
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```

**Example 2:**

```
Input: n = 2
Output: false
```

 

**Constraints:**

	- `1 <= n <= 2^31 - 1`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 77.40%)
- **Memory:** 42.5 MB (Beats 50.69%)
- **Submission Date:** 2026-09-11 04:51:48
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/happy-number/)
