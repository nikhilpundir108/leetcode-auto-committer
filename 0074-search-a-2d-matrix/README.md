# [0074. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)

## Difficulty: `Medium` | Topics: `Array` `Binary Search` `Matrix`

---

## 📝 Problem Statement

You are given an `m x n` integer matrix `matrix` with the following two properties:

	- Each row is sorted in non-decreasing order.

	- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` *if* `target` *is in* `matrix` *or* `false` *otherwise*.

You must write a solution in `O(log(m * n))` time complexity.

 

**Example 1:**

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
```

**Example 2:**

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
```

 

**Constraints:**

	- `m == matrix.length`

	- `n == matrix[i].length`

	- `1 <= m, n <= 100`

	- `-10^4 <= matrix[i][j], target <= 10^4`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 43.9 MB (Beats 43.56%)
- **Submission Date:** 2026-03-25 03:36:17
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/search-a-2d-matrix/)
