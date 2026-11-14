# [1015. Smallest Integer Divisible by K](https://leetcode.com/problems/smallest-integer-divisible-by-k/)

## Difficulty: `Medium` | Topics: `Hash Table` `Math` `Pigeonhole Principle`

---

## 📝 Problem Statement

Given a positive integer `k`, you need to find the **length** of the **smallest** positive integer `n` such that `n` is divisible by `k`, and `n` only contains the digit `1`.

Return *the **length** of *`n`. If there is no such `n`, return -1.

**Note:** `n` may not fit in a 64-bit signed integer.

 

**Example 1:**

```
Input: k = 1
Output: 1
Explanation: The smallest answer is n = 1, which has length 1.
```

**Example 2:**

```
Input: k = 2
Output: -1
Explanation: There is no such positive integer n divisible by 2.
```

**Example 3:**

```
Input: k = 3
Output: 3
Explanation: The smallest answer is n = 111, which has length 3.
```

 

**Constraints:**

	- `1 <= k <= 10^5`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 99.60%)
- **Memory:** 41.8 MB (Beats 68.72%)
- **Submission Date:** 2026-11-13 20:16:51 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/smallest-integer-divisible-by-k/)
