-- Problem: Big Countries (LeetCode #595)
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 266 ms (Beats 93.84%)
-- Memory: 0B (Beats 100.00%)
-- Solved At: 2026-11-27 19:54:49 IST
-- Link: https://leetcode.com/problems/big-countries/

# Write your MySQL query statement below
select name, population, area from world
where area>=3000000 or population >= 25000000;