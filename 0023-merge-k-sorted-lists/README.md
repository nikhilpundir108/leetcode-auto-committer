# [0023. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

## Difficulty: `Hard` | Topics: `Linked List` `Divide and Conquer` `Heap (Priority Queue)` `Merge Sort` `Tournament Sort`

---

## 📝 Problem Statement

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

*Merge all the linked-lists into one sorted linked-list and return it.*

 

**Example 1:**

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6
```

**Example 2:**

```
Input: lists = []
Output: []
```

**Example 3:**

```
Input: lists = [[]]
Output: []
```

 

**Constraints:**

	- `k == lists.length`

	- `0 <= k <= 10^4`

	- `0 <= lists[i].length <= 500`

	- `-10^4 <= lists[i][j] <= 10^4`

	- `lists[i]` is sorted in **ascending order**.

	- The sum of `lists[i].length` will not exceed `10^4`.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 99.97%)
- **Memory:** 46.3 MB (Beats 83.55%)
- **Submission Date:** 2026-11-13 15:42:45 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/merge-k-sorted-lists/)
