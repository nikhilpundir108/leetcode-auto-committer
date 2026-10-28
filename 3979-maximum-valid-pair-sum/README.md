# [3979. Maximum Valid Pair Sum](https://leetcode.com/problems/maximum-valid-pair-sum/)

## Difficulty: `Medium` | Topics: `Array` `Enumeration`

---

## 📝 Problem Statement

You are given an integer array `nums` of length `n` and an integer `k`.

A pair of indices `(i, j)` is called **valid** if:

	- `0 = k`

Return the **maximum** value of `nums[i] + nums[j]` among all valid pairs.

 

**Example 1:**

**Input:** nums = [1,3,5,2,8], k = 2

**Output:** 13

**Explanation:**

The valid pairs are:

	- `(0, 2)`: `nums[0] + nums[2] = 6`

	- `(0, 3)`: `nums[0] + nums[3] = 3`

	- `(0, 4)`: `nums[0] + nums[4] = 9`

	- `(1, 3)`: `nums[1] + nums[3] = 5`

	- `(1, 4)`: `nums[1] + nums[4] = 11`

	- `(2, 4)`: `nums[2] + nums[4] = 13`

Thus, the answer is 13.​​​​​​​

**Example 2:**

**Input:** nums = [5,1,9], k = 1

**Output:** 14

**Explanation:**

	- Since `k = 1`, every pair is valid.

	- The maximum value is obtained from a pair `(0, 2)`​​​​​​​, which is `nums[0] + nums[2] = 5 + 9 = 14`.

	- Thus, the answer is 14.

 

**Constraints:**

	- `2 <= n == nums.length <= 10^5`

	- `1 <= nums[i] <= 10^9`

	- `1 <= k <= n - 1`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 51.82%)
- **Memory:** 118.6 MB (Beats 74.09%)
- **Submission Date:** 2026-10-28 11:26:03 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/maximum-valid-pair-sum/)
