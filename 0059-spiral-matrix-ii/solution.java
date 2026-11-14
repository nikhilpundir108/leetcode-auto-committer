/*
 * Problem: Spiral Matrix II (LeetCode #59)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.3 MB (Beats 87.42%)
 * Solved At: 2026-11-11 14:19:22 IST
 * Link: https://leetcode.com/problems/spiral-matrix-ii/
 */


class Solution {
    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int count = 1;

        while (left <= right && top <= bottom) {

            for (int j = left; j <= right; j++) {
                ans[top][j] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans[i][right] = count++;
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[bottom][j] = count++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = count++;
                }
                left++;
            }
        }

        return ans;
    }
}
