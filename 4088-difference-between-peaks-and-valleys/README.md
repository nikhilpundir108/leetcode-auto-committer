# [4088. Difference Between Peaks and Valleys](https://leetcode.com/problems/difference-between-peaks-and-valleys/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

You are given an integer array `nums` of length `n`.

An index `i` is called a **peak** if **all** of the following conditions hold:

	- `0  nums[i - 1]`

	- `nums[i] > nums[i + 1]`

An index `i` is called a **valley** if **all** of the following conditions hold:

	- `0 
**Input:** nums = [1,5,2,4,1,3,0]

**Output:** 9

**Explanation:**

	- The peak values are `nums[1] = 5`, `nums[3] = 4`, and `nums[5] = 3`.

	- The valley values are `nums[2] = 2` and `nums[4] = 1`.

	- The difference between the sum of the peak values and the sum of the valley values is `(5 + 4 + 3) - (2 + 1) = 9`. Hence, the answer is 9.

**Example 2:**

**Input:** nums = [-5,-6,-1,-2,5,3,2]

**Output:** 12

**Explanation:**

	- The peak values are `nums[2] = -1` and `nums[4] = 5`.

	- The valley values are `nums[1] = -6` and `nums[3] = -2`.

	- The difference between the sum of the peak values and the sum of the valley values is `(-1 + 5) - (-6 + (-2)) = 12`. Hence, the answer is 12.

**Example 3:**

**Input:** nums = [6,5,2,5,5,3,6]

**Output:** -5

**Explanation:**

	- There are no peak values in the array.

	- The valley values are `nums[2] = 2` and `nums[5] = 3`.

	- The difference between the sum of the peak values and the sum of the valley values is `(0) - (2 + 3) = -5`. Hence, the answer is -5.

 

**Constraints:**

	- `3 <= n == nums.length <= 100`

	- `-100 <= nums[i] <= 100`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 85.64%)
- **Memory:** 45.6 MB (Beats 74.40%)
- **Submission Date:** 2026-10-24 20:06:39 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/difference-between-peaks-and-valleys/)
