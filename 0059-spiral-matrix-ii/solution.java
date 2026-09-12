/*
 * Problem: Spiral Matrix II (LeetCode #59)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.8 MB (Beats 62.96%)
 * Solved At: 2026-08-17 18:14:53
 * Link: https://leetcode.com/problems/spiral-matrix-ii/
 */

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int left = 0;
        int bottom = n-1;
        int right = n-1;
        int k = 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                ans[top][i] = k;
                k++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                ans[i][right] = k;
                k++;
            }
            for (int i = right - 1; i >= left; i--) {
                ans[bottom][i] = k;
                k++;
            }
            for (int i = bottom - 1; i >= top + 1; i--) {
                ans[i][left] = k;
                k++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return ans;
    }
}