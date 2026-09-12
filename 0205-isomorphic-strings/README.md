# [0205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)

## Difficulty: `Easy` | Topics: `Hash Table` `String`

---

## 📝 Problem Statement

Given two strings `s` and `t`, *determine if they are isomorphic*.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

**Example 1:**

**Input:** s = "egg", t = "add"

**Output:** true

**Explanation:**

The strings `s` and `t` can be made identical by:

	- Mapping `'e'` to `'a'`.

	- Mapping `'g'` to `'d'`.

**Example 2:**

**Input:** s = "f11", t = "b23"

**Output:** false

**Explanation:**

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

**Example 3:**

**Input:** s = "paper", t = "title"

**Output:** true

 

**Constraints:**

	- `1 <= s.length <= 5 * 10^4`

	- `t.length == s.length`

	- `s` and `t` consist of any valid ascii character.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 17 ms (Beats 41.75%)
- **Memory:** 44 MB (Beats 41.91%)
- **Submission Date:** 2026-07-31 22:29:35
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/isomorphic-strings/)
