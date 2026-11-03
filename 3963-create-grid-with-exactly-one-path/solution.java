/*
 * Problem: Create Grid With Exactly One Path (LeetCode #3963)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 99.61%)
 * Memory: 46.2 MB (Beats 35.42%)
 * Solved At: 2026-11-03 19:33:25 IST
 * Link: https://leetcode.com/problems/create-grid-with-exactly-one-path/
 */

class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], '#');
        }

        for (int j = 0; j < n; j++) {
            arr[0][j] = '.';
        }

        for (int i = 1; i < m; i++) {
            arr[i][n - 1] = '.';
        }

        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(arr[i]);
        }

        return ans;
    }
}