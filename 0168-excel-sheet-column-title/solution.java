/*
 * Problem: Excel Sheet Column Title (LeetCode #168)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.1 MB (Beats 84.02%)
 * Solved At: 2026-10-27 23:28:15 IST
 * Link: https://leetcode.com/problems/excel-sheet-column-title/
 */

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // shift to 0-indexed
            sb.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}