# [3963. Create Grid With Exactly One Path](https://leetcode.com/problems/create-grid-with-exactly-one-path/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

You are given two integers `m` and `n`, representing the number of rows and columns of a grid.

Construct **any** `m x n` grid consisting only of the characters `'.'` and `'#'`, where:

	- `'.'` represents a free cell.

	- `'#'` represents an obstacle cell.

A **valid path** is a sequence of free cells that:

	- Starts at the top-left cell `(0, 0)`.

	- Ends at the bottom-right cell `(m - 1, n - 1)`.

	- Moves only:
	

		Right, from `(i, j)` to `(i, j + 1)`, or

		- Down, from `(i, j)` to `(i + 1, j)`.

	

	

Return any grid such that there is **exactly one valid path** from the top-left cell to the bottom-right cell.

 

**Example 1:**

**Input:** m = 2, n = 3

**Output:** ["..#","#.."]

**Explanation:**

The only valid path is: `(0,0) &rarr; (0,1) &rarr; (1,1) &rarr; (1,2)`

**Example 2:**

**Input:** m = 3, n = 3

**Output:** ["..#","#..","##."]

**Explanation:**

The only valid path is: `(0,0) &rarr; (0,1) &rarr; (1,1) &rarr; (1,2) &rarr; (2,2)`

**Example 3:**

**Input:** m = 1, n = 4

**Output:** ["...."]

**Explanation:**

The only valid path is: `(0,0) &rarr; (0,1) &rarr; (0,2) &rarr; (0,3)`

 

**Constraints:**

	- `1 <= m, n <= 25`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 99.61%)
- **Memory:** 46.2 MB (Beats 35.42%)
- **Submission Date:** 2026-11-03 19:33:25 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/create-grid-with-exactly-one-path/)
