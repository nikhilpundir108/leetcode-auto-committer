# [4083. Minimum Deletions to Make Array Sharp](https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

You are given an integer array `nums`.

You may delete any number of elements from `nums`. The remaining elements keep their original order.

The resulting array `a` is **sharp** if the **bitwise XOR** of every pair of **adjacent** elements is **non-zero**. That is, `a[i] XOR a[i + 1] != 0` for every index `i` such that `0 
**Input:** nums = [1,1,2,2,2,3]

**Output:** 3

**Explanation:**

	- The pairs at indices `(0, 1)`, `(2, 3)`, and `(3, 4)` each have an XOR of 0.

	- Deleting one 1 and two 2s leaves `[1, 2, 3]`, where `1 XOR 2 == 3` and `2 XOR 3 == 1` are both non-zero. Therefore, the answer is 3.

**Example 2:**

**Input:** nums = [4,4,9,4]

**Output:** 1

**Explanation:**

	- The pair at indices `(0, 1)` has an XOR of 0.

	- Deleting either of these two 4s leaves `[4, 9, 4]`, where `4 XOR 9 == 13` and `9 XOR 4 == 13` are both non-zero.

 

**Constraints:**

	- `2 <= nums.length <= 100`

	- `1 <= nums[i] <= 100`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 100.00%)
- **Memory:** 46.1 MB (Beats 9.51%)
- **Submission Date:** 2026-10-18 15:33:45 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/)
