# [3727. Maximum Alternating Sum of Squares](https://leetcode.com/problems/maximum-alternating-sum-of-squares/)

## Difficulty: `Medium` | Topics: `Array` `Greedy` `Sorting`

---

## 📝 Problem Statement

You are given an integer array `nums`. You may **rearrange the elements** in any order.

The **alternating score** of an array `arr` is defined as:

	- `score = arr[0]^2 - arr[1]^2 + arr[2]^2 - arr[3]^2 + ...`

Return an integer denoting the **maximum possible alternating score** of `nums` after rearranging its elements.

 

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 12

**Explanation:**

A possible rearrangement for `nums` is `[2,1,3]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

`score = 2^2 - 1^2 + 3^2 = 4 - 1 + 9 = 12`

**Example 2:**

**Input:** nums = [1,-1,2,-2,3,-3]

**Output:** 16

**Explanation:**

A possible rearrangement for `nums` is `[-3,-1,-2,1,3,2]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

`score = (-3)^2 - (-1)^2 + (-2)^2 - (1)^2 + (3)^2 - (2)^2 = 9 - 1 + 4 - 1 + 9 - 4 = 16`

 

**Constraints:**

	- `1 <= nums.length <= 10^5`

	- `-4 * 10^4 <= nums[i] <= 4 * 10^4`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 33 ms (Beats 68.31%)
- **Memory:** 138.1 MB (Beats 17.61%)
- **Submission Date:** 2026-10-13 14:06:25 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/maximum-alternating-sum-of-squares/)
