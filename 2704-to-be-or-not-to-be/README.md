# [2704. To Be Or Not To Be](https://leetcode.com/problems/to-be-or-not-to-be/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

Write a function `expect` that helps developers test their code. It should take in any value `val` and return an object with the following two functions.

	- `toBe(val)` accepts another value and returns `true` if the two values `===` each other. If they are not equal, it should throw an error `"Not Equal"`.

	- `notToBe(val)` accepts another value and returns `true` if the two values `!==` each other. If they are equal, it should throw an error `"Equal"`.

 

**Example 1:**

```
Input: func = () => expect(5).toBe(5)
Output: {"value": true}
Explanation: 5 === 5 so this expression returns true.
```

**Example 2:**

```
Input: func = () => expect(5).toBe(null)
Output: {"error": "Not Equal"}
Explanation: 5 !== null so this expression throw the error "Not Equal".
```

**Example 3:**

```
Input: func = () => expect(5).notToBe(null)
Output: {"value": true}
Explanation: 5 !== null so this expression returns true.
```

---

## 📈 Submission Details

- **Language:** JavaScript
- **Runtime:** 40 ms (Beats 76.18%)
- **Memory:** 53.3 MB (Beats 65.08%)
- **Submission Date:** 2026-10-04 16:23:06 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/to-be-or-not-to-be/)
