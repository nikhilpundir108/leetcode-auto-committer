/*
 * Problem: Count Servers that Communicate (LeetCode #1267)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 54.97%)
 * Memory: 54.4 MB (Beats 82.61%)
 * Solved At: 2026-11-08 14:42:02 IST
 * Link: https://leetcode.com/problems/count-servers-that-communicate/
 */

class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (row[i] > 1 || col[j] > 1) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}