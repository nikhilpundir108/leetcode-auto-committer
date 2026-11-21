# [0347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

## Difficulty: `Medium` | Topics: `Array` `Hash Table` `Divide and Conquer` `Sorting` `Heap (Priority Queue)` `Bucket Sort` `Counting` `Quickselect`

---

## 📝 Problem Statement

Given an integer array `nums` and an integer `k`, return *the* `k` *most frequent elements*. You may return the answer in **any order**.

 

**Example 1:**

**Input:** nums = [1,1,1,2,2,3], k = 2

**Output:** [1,2]

**Example 2:**

**Input:** nums = [1], k = 1

**Output:** [1]

**Example 3:**

**Input:** nums = [1,2,1,2,1,2,3,1,3,2], k = 2

**Output:** [1,2]

 

**Constraints:**

	- `1 <= nums.length <= 10^5`

	- `-10^4 <= nums[i] <= 10^4`

	- `k` is in the range `[1, the number of unique elements in the array]`.

	- It is **guaranteed** that the answer is **unique**.

 

**Follow up:** Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 16 ms (Beats 47.02%)
- **Memory:** 47 MB (Beats 88.75%)
- **Submission Date:** 2026-11-22 01:28:26 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/top-k-frequent-elements/)
