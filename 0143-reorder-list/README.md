# [0143. Reorder List](https://leetcode.com/problems/reorder-list/)

## Difficulty: `Medium` | Topics: `Linked List` `Two Pointers` `Stack` `Recursion`

---

## 📝 Problem Statement

You are given the head of a singly linked-list. The list can be represented as:

```
L0 &rarr; L1 &rarr; &hellip; &rarr; Ln - 1 &rarr; Ln
```

*Reorder the list to be on the following form:*

```
L0 &rarr; Ln &rarr; L1 &rarr; Ln - 1 &rarr; L2 &rarr; Ln - 2 &rarr; &hellip;
```

You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

**Example 1:**

```
Input: head = [1,2,3,4]
Output: [1,4,2,3]
```

**Example 2:**

```
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
```

 

**Constraints:**

	- The number of nodes in the list is in the range `[1, 5 * 10^4]`.

	- `1 <= Node.val <= 1000`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 86.77%)
- **Memory:** 49.5 MB (Beats 13.94%)
- **Submission Date:** 2026-07-28 13:09:56
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/reorder-list/)
