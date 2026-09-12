/*
 * Problem: Matrix Diagonal Sum (LeetCode #1572)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.3 MB (Beats 52.10%)
 * Solved At: 2026-09-09 09:54:39
 * Link: https://leetcode.com/problems/matrix-diagonal-sum/
 */

class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}