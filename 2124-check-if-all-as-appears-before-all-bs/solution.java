/*
 * Problem: Check if All A's Appears Before All B's (LeetCode #2124)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.3 MB (Beats 83.01%)
 * Solved At: 2026-11-22 13:14:58 IST
 * Link: https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
 */

class Solution {
    public boolean checkString(String s) {
        return s.contains("ba") ? false : true;
    }
}