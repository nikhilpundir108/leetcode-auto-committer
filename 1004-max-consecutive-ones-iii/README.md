# [1004. Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/)

## Difficulty: `Medium` | Topics: `Array` `Binary Search` `Sliding Window` `Prefix Sum`

---

## 📝 Problem Statement

Given a binary array `nums` and an integer `k`, return *the maximum number of consecutive *`1`*'s in the array if you can flip at most* `k` `0`'s.

 

**Example 1:**

```
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

**Example 2:**

```
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
```

 

**Constraints:**

	- `1 <= nums.length <= 10^5`

	- `nums[i]` is either 0 or 1.

	- `0 <= k <= nums.length`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 3 ms (Beats 95.85%)
- **Memory:** 52.4 MB (Beats 6.43%)
- **Submission Date:** 2026-09-18 14:28:28 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/max-consecutive-ones-iii/)
