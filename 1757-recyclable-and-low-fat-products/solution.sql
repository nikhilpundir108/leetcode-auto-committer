-- Problem: Recyclable and Low Fat Products (LeetCode #1757)
-- Difficulty: Easy
-- Language: MySQL
-- Runtime: 553 ms (Beats 69.95%)
-- Memory: 0B (Beats 100.00%)
-- Solved At: 2026-11-27 19:46:56 IST
-- Link: https://leetcode.com/problems/recyclable-and-low-fat-products/

select product_id from products
where low_fats='y' And recyclable ='y';