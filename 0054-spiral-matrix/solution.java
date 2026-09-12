/*
 * Problem: Spiral Matrix (LeetCode #54)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.1 MB (Beats 43.68%)
 * Solved At: 2026-08-05 19:47:08
 * Link: https://leetcode.com/problems/spiral-matrix/
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            if (top < bottom)
                for (int i = right - 1; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            if (left < right)
                for (int i = bottom - 1; i >= top + 1; i--) {
                    ans.add(matrix[i][left]);
                }
            left++;
            top++;
            right--;
            bottom--;
        }
        return ans;

    }
}