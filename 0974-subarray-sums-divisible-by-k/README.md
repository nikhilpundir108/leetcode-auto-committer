# [0974. Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/)

## Difficulty: `Medium` | Topics: `Array` `Hash Table` `Prefix Sum`

---

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`, return *the number of non-empty **subarrays** that have a sum divisible by *`k`.

A **subarray** is a **contiguous** part of an array.

 

**Example 1:**

```
Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
```

**Example 2:**

```
Input: nums = [5], k = 9
Output: 0
```

 

**Constraints:**

	- `1 <= nums.length <= 3 * 10^4`

	- `-10^4 <= nums[i] <= 10^4`

	- `2 <= k <= 10^4`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 27 ms (Beats 9.97%)
- **Memory:** 51.1 MB (Beats 72.05%)
- **Submission Date:** 2026-10-28 10:48:35 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/subarray-sums-divisible-by-k/)
