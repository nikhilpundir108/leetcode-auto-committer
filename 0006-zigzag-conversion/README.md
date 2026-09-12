# [0006. Zigzag Conversion](https://leetcode.com/problems/zigzag-conversion/)

## Difficulty: `Medium` | Topics: `String`

---

## 📝 Problem Statement

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

 

**Example 1:**

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

**Example 2:**

```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
```

**Example 3:**

```
Input: s = "A", numRows = 1
Output: "A"
```

 

**Constraints:**

	- `1 <= s.length <= 1000`

	- `s` consists of English letters (lower-case and upper-case), `','` and `'.'`.

	- `1 <= numRows <= 1000`

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 8 ms (Beats 15.68%)
- **Memory:** 47.2 MB (Beats 16.41%)
- **Submission Date:** 2026-09-11 09:21:21
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/zigzag-conversion/)
