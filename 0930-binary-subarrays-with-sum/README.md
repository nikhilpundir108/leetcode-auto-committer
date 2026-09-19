# [0930. Binary Subarrays With Sum](https://leetcode.com/problems/binary-subarrays-with-sum/)

## Difficulty: `Medium` | Topics: `Array` `Hash Table` `Sliding Window` `Prefix Sum`

---

## 📝 Problem Statement

Given a binary array `nums` and an integer `goal`, return *the number of non-empty **subarrays** with a sum* `goal`.

A **subarray** is a contiguous part of the array.

 

**Example 1:**

```
Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
```

**Example 2:**

```
Input: nums = [0,0,0,0,0], goal = 0
Output: 15
```

 

**Constraints:**

	- `1 <= nums.length <= 3 * 10^4`

	- `nums[i]` is either `0` or `1`.

	- `0 <= goal <= nums.length`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 99.98%)
- **Memory:** 51 MB (Beats 42.97%)
- **Submission Date:** 2026-09-20 24:22:56 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/binary-subarrays-with-sum/)
