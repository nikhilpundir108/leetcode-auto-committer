# [4116. Assign Umbrella on Rainy Days](https://leetcode.com/problems/assign-umbrella-on-rainy-days/)

## Difficulty: `Easy` | Topics: `None`

---

## 📝 Problem Statement

You are given a **binary array** `rain` of length `n`, where `rain[i] == 1` means it rains on day `i`, and `rain[i] == 0` means it does not.

Alice and Bob share a **single umbrella** over these `n` days. On each day `i`:

	- Alice needs the umbrella on day `i` if `rain[i] == rain[i + 1] == 1` for `0 
**Input:** rain = [1,1,0,1,1]

**Output:** ["Alice","Bob","None","Alice","Bob"]

**Explanation:**

	- Day 0: `rain[0] == 1` and `rain[1] == 1`, so both need it. Counts are tied, so Alice receives it.

	- Day 1: `rain[1] == 1`, so Bob needs it, but `rain[2] == 0`, so Alice does not need it. Therefore Bob receives it.

	- Day 2: No rain, so no one receives it.

	- Day 3: `rain[3] == 1` and `rain[4] == 1`, so both need it. Counts are tied at 1, so Alice receives it.

	- Day 4: Last day, so only Bob needs it, and he receives it.

	- Therefore, `answer = ["Alice", "Bob", "None", "Alice", "Bob"]`.

**Example 2:**

**Input:** rain = [0,1,0,1]

**Output:** ["None","Bob","None","Bob"]

**Explanation:**

	- It never rains on two consecutive days, so Alice never needs the umbrella.

	- Bob receives it on days 1 and 3, and no one receives it on days 0 and 2.

	- Therefore, `answer = ["None", "Bob", "None", "Bob"]`.

 

**Constraints:**

	- `1 <= n == rain.length <= 100`

	- `rain[i]` is either 0 or 1.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 100.00%)
- **Memory:** 47 MB (Beats 0.00%)
- **Submission Date:** 2026-11-21 20:16:59 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/assign-umbrella-on-rainy-days/)
