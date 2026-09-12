/*
 * Problem: Search a 2D Matrix (LeetCode #74)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.9 MB (Beats 43.56%)
 * Solved At: 2026-03-25 03:36:17
 * Link: https://leetcode.com/problems/search-a-2d-matrix/
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