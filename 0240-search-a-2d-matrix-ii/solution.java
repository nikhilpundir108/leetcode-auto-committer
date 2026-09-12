/*
 * Problem: Search a 2D Matrix II (LeetCode #240)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 85.42%)
 * Memory: 48.2 MB (Beats 45.57%)
 * Solved At: 2026-04-06 08:38:20
 * Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}