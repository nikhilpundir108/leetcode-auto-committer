# [1539. Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)

## Difficulty: `Easy` | Topics: `Array` `Binary Search`

---

## 📝 Problem Statement

Given an array `arr` of positive integers sorted in a **strictly increasing order**, and an integer `k`.

Return *the* `k^th` ***positive** integer that is **missing** from this array.*

 

**Example 1:**

```
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
```

**Example 2:**

```
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
```

 

**Constraints:**

	- `1 <= arr.length <= 1000`

	- `1 <= arr[i] <= 1000`

	- `1 <= k <= 1000`

	- `arr[i] < arr[j]` for `1 <= i < j <= arr.length`

 

**Follow up:**

Could you solve this problem in less than O(n) complexity?

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 44.7 MB (Beats 40.52%)
- **Submission Date:** 2026-04-09 13:04:34
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/kth-missing-positive-number/)
