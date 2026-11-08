# [2621. Sleep](https://leetcode.com/problems/sleep/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

Given a positive integer `millis`, write an asynchronous function that sleeps for `millis` milliseconds. It can resolve any value.

**Note** that *minor* deviation from `millis` in the actual sleep duration is acceptable.

 

**Example 1:**

```
Input: millis = 100
Output: 100
Explanation: It should return a promise that resolves after 100ms.
let t = Date.now();
sleep(100).then(() => {
  console.log(Date.now() - t); // 100
});
```

**Example 2:**

```
Input: millis = 200
Output: 200
Explanation: It should return a promise that resolves after 200ms.
```

 

**Constraints:**

	- `1 <= millis <= 1000`

---

## 📈 Submission Details

- **Language:** JavaScript
- **Runtime:** 42 ms (Beats 73.44%)
- **Memory:** 53.9 MB (Beats 40.08%)
- **Submission Date:** 2026-11-08 16:53:48 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/sleep/)
