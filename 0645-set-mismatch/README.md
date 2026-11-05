# [0645. Set Mismatch](https://leetcode.com/problems/set-mismatch/)

## Difficulty: `Easy` | Topics: `Array` `Hash Table` `Bit Manipulation` `Sorting`

---

## 📝 Problem Statement

You have a set of integers `s`, which originally contains all the numbers from `1` to `n`. Unfortunately, due to some error, one of the numbers in `s` got duplicated to another number in the set, which results in **repetition of one** number and **loss of another** number.

You are given an integer array `nums` representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return *them in the form of an array*.

 

**Example 1:**

```
Input: nums = [1,2,2,4]
Output: [2,3]
```

**Example 2:**

```
Input: nums = [1,1]
Output: [1,2]
```

 

**Constraints:**

	- `2 <= nums.length <= 10^4`

	- `1 <= nums[i] <= 10^4`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 95.88%)
- **Memory:** 47.3 MB (Beats 71.48%)
- **Submission Date:** 2026-11-05 20:49:27 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/set-mismatch/)
