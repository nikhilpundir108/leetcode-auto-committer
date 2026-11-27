-- Problem: Find Customer Referee (LeetCode #584)
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 434 ms (Beats 92.89%)
-- Memory: 0B (Beats 100.00%)
-- Solved At: 2026-11-27 19:52:18 IST
-- Link: https://leetcode.com/problems/find-customer-referee/

# Write your MySQL query statement below
select name from customer
where referee_id!=2 Or referee_id is null;