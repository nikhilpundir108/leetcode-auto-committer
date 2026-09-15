/*
 * Problem: Count Negative Numbers in a Sorted Matrix (LeetCode #1351)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 54.62%)
 * Memory: 46.9 MB (Beats 43.53%)
 * Solved At: 2026-09-15 11:48:21 IST
 * Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */

class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}