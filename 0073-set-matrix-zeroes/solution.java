/*
 * Problem: Set Matrix Zeroes (LeetCode #73)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 96.08%)
 * Memory: 47.7 MB (Beats 24.33%)
 * Solved At: 2026-09-10 08:45:43
 * Link: https://leetcode.com/problems/set-matrix-zeroes/
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] arow = new boolean[row];
        boolean[] acol = new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    arow[i] = true;
                    acol[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arow[i] || acol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}