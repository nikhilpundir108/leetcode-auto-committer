# [2667. Create Hello World Function](https://leetcode.com/problems/create-hello-world-function/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

Write a function `createHelloWorld`. It should return a new function that always returns `"Hello World"`.
 

**Example 1:**

```
Input: args = []
Output: "Hello World"
Explanation:
const f = createHelloWorld();
f(); // "Hello World"

The function returned by createHelloWorld should always return "Hello World".
```

**Example 2:**

```
Input: args = [{},null,42]
Output: "Hello World"
Explanation:
const f = createHelloWorld();
f({}, null, 42); // "Hello World"

Any arguments could be passed to the function but it should still always return "Hello World".
```

 

**Constraints:**

	- `0 <= args.length <= 10`

---

## 📈 Submission Details

- **Language:** JavaScript
- **Runtime:** 50 ms (Beats 11.91%)
- **Memory:** 54.4 MB (Beats 14.84%)
- **Submission Date:** 2026-10-30 23:52:13 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/create-hello-world-function/)
