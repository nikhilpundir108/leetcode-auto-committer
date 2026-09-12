/*
 * Problem: Lucky Numbers in a Matrix (LeetCode #1380)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 43.69%)
 * Memory: 47 MB (Beats 71.17%)
 * Solved At: 2026-09-09 10:23:49
 * Link: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 */

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int[] min = new int[row];
        int[] max = new int[col];
        for (int i = 0; i < row; i++) {
            min[i] = matrix[i][0];
            for (int j = 0; j < col; j++) {
                min[i] = Math.min(min[i], matrix[i][j]);
            }
        }
        for (int j = 0; j < col; j++) {
            max[j] = matrix[0][j];
            for (int i = 0; i < row; i++) {
                max[j] = Math.max(max[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == min[i] && matrix[i][j] == max[j]) {
                    l.add(matrix[i][j]);
                }
            }
        }
        return l;
    }
}