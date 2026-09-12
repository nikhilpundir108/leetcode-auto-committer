/*
 * Problem: Determine Color of a Chessboard Square (LeetCode #1812)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.8 MB (Beats 34.49%)
 * Solved At: 2026-09-07 08:57:26
 * Link: https://leetcode.com/problems/determine-color-of-a-chessboard-square/
 */

class Solution {
    public boolean squareIsWhite(String coordinates) {
        int f = coordinates.charAt(0) - 'a' + 1;
        int s = coordinates.charAt(1) - '0';
        if ((f + s) % 2 == 0) {
            return false;
        }
        return true;
    }
}