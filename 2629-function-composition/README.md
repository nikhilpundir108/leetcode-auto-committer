# [2629. Function Composition](https://leetcode.com/problems/function-composition/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

Given an array of functions `[f1, f_2, f_3, ..., f_n]`, return a new function `fn` that is the **function composition** of the array of functions.

The **function composition** of `[f(x), g(x), h(x)]` is `fn(x) = f(g(h(x)))`.

The **function composition** of an empty list of functions is the **identity function** `f(x) = x`.

You may assume each function in the array accepts one integer as input and returns one integer as output.

 

**Example 1:**

```
Input: functions = [x => x + 1, x => x * x, x => 2 * x], x = 4
Output: 65
Explanation:
Evaluating from right to left ...
Starting with x = 4.
2 * (4) = 8
(8) * (8) = 64
(64) + 1 = 65
```

**Example 2:**

```
Input: functions = [x => 10 * x, x => 10 * x, x => 10 * x], x = 1
Output: 1000
Explanation:
Evaluating from right to left ...
10 * (1) = 10
10 * (10) = 100
10 * (100) = 1000
```

**Example 3:**

```
Input: functions = [], x = 42
Output: 42
Explanation:
The composition of zero functions is the identity function
```

 

**Constraints:**

	- `-1000 `

	- `0 `

	- all functions accept and return a single integer

---

## 📈 Submission Details

- **Language:** JavaScript
- **Runtime:** 59 ms (Beats 35.51%)
- **Memory:** 55.8 MB (Beats 27.54%)
- **Submission Date:** 2026-11-08 15:10:31 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/function-composition/)
