/*
 * Problem: Excel Sheet Column Number (LeetCode #171)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 89.65%)
 * Memory: 43.5 MB (Beats 54.84%)
 * Solved At: 2026-09-20 11:38:30 IST
 * Link: https://leetcode.com/problems/excel-sheet-column-number/
 */

class Solution {
    int res = 0;
    public int titleToNumber(String columnTitle) {
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int val = ch - 'A' + 1;
            res = res * 26 + val;
        }
        return res;
    }
}