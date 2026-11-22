# [4120. Count Dominant Elements](https://leetcode.com/problems/count-dominant-elements/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

You are given an integer array `nums`.

An element in `nums` is called **dominant** if it is **greater than or equal to** the average of its immediate neighbors.

The immediate neighbors of `nums[i]` are `nums[i - 1]` and `nums[i + 1]`, when those indices exist.

A single element with no neighbors is considered **dominant**.

Return the number of **dominant** elements in `nums`.

 

**Example 1:**

**Input:** nums = [1,10,2]

**Output:** 1

**Explanation:**

	- For `nums[0] = 1`, its only neighbor is 10. Since `1  1.5`, it is dominant.

	- For `nums[2] = 2`, its only neighbor is 10. Since `2 

**Example 2:**

**Input:** nums = [6,4,2]

**Output:** 2

**Explanation:**

	- For `nums[0] = 6`, its only neighbor is 4. Since `6 > 4`, it is dominant.

	- For `nums[1] = 4`, its neighbors are 6 and 2. Their average is `(6 + 2) / 2 = 4`. Since `4 = 4`, it is dominant.

	- For `nums[2] = 2`, its only neighbor is 4. Since `2 

**Example 3:**

**Input:** nums = [7]

**Output:** 1

**Explanation:**

	- For `nums[0] = 7`, it has no neighbors, so it is dominant.

Therefore, the answer is 1.

 

**Constraints:**

	- `1 <= nums.length <= 100`

	- `1 <= nums[i] <= 100`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 100.00%)
- **Memory:** 46.1 MB (Beats 32.89%)
- **Submission Date:** 2026-11-22 08:37:29 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/count-dominant-elements/)
