# [0500. Keyboard Row](https://leetcode.com/problems/keyboard-row/)

## Difficulty: `Easy` | Topics: `Array` `Hash Table` `String`

---

## 📝 Problem Statement

Given an array of strings `words`, return *the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below*.

**Note** that the strings are **case-insensitive**, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the **American keyboard**:

	- the first row consists of the characters `"qwertyuiop"`,

	- the second row consists of the characters `"asdfghjkl"`, and

	- the third row consists of the characters `"zxcvbnm"`.

 

**Example 1:**

**Input:** words = ["Hello","Alaska","Dad","Peace"]

**Output:** ["Alaska","Dad"]

**Explanation:**

Both `"a"` and `"A"` are in the 2nd row of the American keyboard due to case insensitivity.

**Example 2:**

**Input:** words = ["omk"]

**Output:** []

**Example 3:**

**Input:** words = ["adsdf","sfd"]

**Output:** ["adsdf","sfd"]

 

**Constraints:**

	- `1 <= words.length <= 20`

	- `1 <= words[i].length <= 100`

	- `words[i]` consists of English letters (both lowercase and uppercase).

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 34.41%)
- **Memory:** 42.9 MB (Beats 51.59%)
- **Submission Date:** 2026-09-30 23:42:32 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/keyboard-row/)
