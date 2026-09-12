/*
 * Problem: Transpose Matrix (LeetCode #867)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.5 MB (Beats 85.58%)
 * Solved At: 2026-09-09 09:15:14
 * Link: https://leetcode.com/problems/transpose-matrix/
 */

class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] res = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}