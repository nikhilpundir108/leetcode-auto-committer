-- Problem: Invalid Tweets (LeetCode #1683)
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 535 ms (Beats 92.95%)
-- Memory: 0B (Beats 100.00%)
-- Solved At: 2026-11-27 20:07:24 IST
-- Link: https://leetcode.com/problems/invalid-tweets/

# Write your MySQL query statement below
select tweet_id from tweets 
where char_length(content)>15;