# [3121. Count the Number of Special Characters II](https://leetcode.com/problems/count-the-number-of-special-characters-ii/)

## Difficulty: `Medium` | Topics: `Hash Table` `String`

---

## 📝 Problem Statement

You are given a string `word`. A letter `c` is called **special** if it appears **both** in lowercase and uppercase in `word`, and **every** lowercase occurrence of `c` appears before the **first** uppercase occurrence of `c`.

Return the number of* ***special** letters* *in* *`word`.

 

**Example 1:**

**Input:** word = "aaAbcBC"

**Output:** 3

**Explanation:**

The special characters are `'a'`, `'b'`, and `'c'`.

**Example 2:**

**Input:** word = "abc"

**Output:** 0

**Explanation:**

There are no special characters in `word`.

**Example 3:**

**Input:** word = "AbBCab"

**Output:** 0

**Explanation:**

There are no special characters in `word`.

 

**Constraints:**

	- `1 <= word.length <= 2 * 10^5`

	- `word` consists of only lowercase and uppercase English letters.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 9 ms (Beats 86.00%)
- **Memory:** 47.4 MB (Beats 98.48%)
- **Submission Date:** 2026-10-19 15:01:46 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/count-the-number-of-special-characters-ii/)
