/*
 * Problem: Count Commas in Range (LeetCode #3870)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 85.82%)
 * Memory: 42.7 MB (Beats 39.53%)
 * Solved At: 2026-09-08 10:03:35
 * Link: https://leetcode.com/problems/count-commas-in-range/
 */

class Solution {
    public int countCommas(int n) {
        return Math.max(n - 999, 0);
    }
}