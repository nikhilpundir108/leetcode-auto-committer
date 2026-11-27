# [0584. Find Customer Referee](https://leetcode.com/problems/find-customer-referee/)

## Difficulty: `Easy` | Topics: `Database`

---

## 📝 Problem Statement

Table: `Customer`

```
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.
```

 

Find the names of the customer that are either:

	- **referred by** any customer with `id != 2`.

	- **not referred by** any customer.

Return the result table in **any order**.

The result format is in the following example.

 

**Example 1:**

```
Input: 
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
Output: 
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+
```

---

## 📈 Submission Details

- **Language:** MySQL
- **Runtime:** 434 ms (Beats 92.89%)
- **Memory:** 0B (Beats 100.00%)
- **Submission Date:** 2026-11-27 19:52:18 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/find-customer-referee/)
