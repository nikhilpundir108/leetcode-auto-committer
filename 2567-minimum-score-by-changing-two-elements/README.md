# [2567. Minimum Score by Changing Two Elements](https://leetcode.com/problems/minimum-score-by-changing-two-elements/)

## Difficulty: `Medium` | Topics: `Array` `Greedy` `Sorting`

---

## 📝 Problem Statement

You are given an integer array `nums`.

	- The **low** score of `nums` is the **minimum** absolute difference between any two integers.

	- The **high** score of `nums` is the **maximum** absolute difference between any two integers.

	- The **score** of `nums` is the sum of the **high** and **low** scores.

Return the **minimum score** after **changing two elements** of `nums`.

 

**Example 1:**

**Input:** nums = [1,4,7,8,5]

**Output:** 3

**Explanation:**

	- Change `nums[0]` and `nums[1]` to be 6 so that `nums` becomes [6,6,7,8,5].

	- The low score is the minimum absolute difference: |6 - 6| = 0.

	- The high score is the maximum absolute difference: |8 - 5| = 3.

	- The sum of high and low score is 3.

**Example 2:**

**Input:** nums = [1,4,3]

**Output:** 0

**Explanation:**

	- Change `nums[1]` and `nums[2]` to 1 so that `nums` becomes [1,1,1].

	- The sum of maximum absolute difference and minimum absolute difference is 0.

 

**Constraints:**

	- `3 <= nums.length <= 10^5`

	- `1 <= nums[i] <= 10^9`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 19 ms (Beats 33.33%)
- **Memory:** 59.5 MB (Beats 46.87%)
- **Submission Date:** 2026-11-19 20:21:00 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/minimum-score-by-changing-two-elements/)
