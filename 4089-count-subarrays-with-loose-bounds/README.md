# [4089. Count Subarrays With Loose Bounds](https://leetcode.com/problems/count-subarrays-with-loose-bounds/)

## Difficulty: `Medium` | Topics: `None`

---

## 📝 Problem Statement

You are given an integer array `nums` and two integers `minK` and `maxK`.

A **loose-bound subarray** is a **subarray** in which every element is **greater than or equal to** `minK` and **less than or equal to** `maxK`.

Return the **number** of loose-bound subarrays in `nums`.

A **subarray** is a contiguous **non-empty** sequence of elements within an array.

 

**Example 1:**

**Input:** nums = [1,4,7,3], minK = 1, maxK = 5

**Output:** 4

**Explanation:**

The loose-bound subarrays are `[1]`, `[4]`, `[3]`, and `[1, 4]`. The minimum value in these subarrays is at least `minK = 1` and the maximum value is at most `maxK = 5`.

**Example 2:**

**Input:** nums = [1,1], minK = 1, maxK = 1

**Output:** 3

**Explanation:**

The loose-bound subarrays are `[1]`, `[1]`, and `[1, 1]`. The minimum value in these subarrays is at least `minK = 1` and the maximum value is at most `maxK = 1`.

 

**Constraints:**

	- `2 <= nums.length <= 10^5`

	- `1 <= nums[i], minK, maxK <= 10^6`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 7 ms (Beats 98.79%)
- **Memory:** 196 MB (Beats 78.00%)
- **Submission Date:** 2026-10-24 20:11:07 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/count-subarrays-with-loose-bounds/)
