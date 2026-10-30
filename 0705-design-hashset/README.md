# [0705. Design HashSet](https://leetcode.com/problems/design-hashset/)

## Difficulty: `Easy` | Topics: `Array` `Hash Table` `Linked List` `Design` `Hash Function`

---

## 📝 Problem Statement

Design a HashSet without using any built-in hash table libraries.

Implement `MyHashSet` class:

	- `void add(key)` Inserts the value `key` into the HashSet.

	- `bool contains(key)` Returns whether the value `key` exists in the HashSet or not.

	- `void remove(key)` Removes the value `key` in the HashSet. If `key` does not exist in the HashSet, do nothing.

 

**Example 1:**

```
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
```

 

**Constraints:**

	- `0 <= key <= 10^6`

	- At most `10^4` calls will be made to `add`, `remove`, and `contains`.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 13 ms (Beats 64.62%)
- **Memory:** 53.9 MB (Beats 62.97%)
- **Submission Date:** 2026-10-30 11:49:05 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/design-hashset/)
