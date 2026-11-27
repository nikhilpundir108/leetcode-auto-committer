-- Problem: Article Views I (LeetCode #1148)
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 635 ms (Beats 11.49%)
-- Memory: 0B (Beats 100.00%)
-- Solved At: 2026-11-27 19:58:46 IST
-- Link: https://leetcode.com/problems/article-views-i/

# Write your MySQL query statement below
select distinct author_id as id from views
where author_id=viewer_id
order by author_id asc;