/*
 * Problem: Count Commas in Range II (LeetCode #3871)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 98.76%)
 * Memory: 42 MB (Beats 99.12%)
 * Solved At: 2026-09-09 04:50:25
 * Link: https://leetcode.com/problems/count-commas-in-range-ii/
 */

class Solution {
    public long countCommas(long n) {
        long ans = 0;
        for (long i = 1000; i <= n; i *= 1000) {
            ans += n - i + 1;
        }
        return ans;
    }
}