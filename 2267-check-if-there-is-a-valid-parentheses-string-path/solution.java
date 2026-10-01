/*
 * Problem:  Check if There Is a Valid Parentheses String Path (LeetCode #2267)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 65 ms (Beats 30.25%)
 * Memory: 48.8 MB (Beats 83.06%)
 * Solved At: 2026-09-29 21:15:50 IST
 * Link: https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/
 */

class Solution {

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if ((m + n - 1) % 2 != 0) {
            return false;
        }
        if (grid[0][0] != '(') {
            return false;
        }
        if (grid[m - 1][n - 1] != ')') {
            return false;
        }
        int maxBalance = m + n;

        boolean[][][] dp = new boolean[m][n][maxBalance];
        dp[0][0][1] = true;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {

                if (r == 0 && c == 0) {
                    continue;
                }

                for (int balance = 0; balance < maxBalance; balance++) {

                    boolean reachable = false;

                    if (r > 0) {
                        reachable |= dp[r - 1][c][balance];
                    }
                    if (c > 0) {
                        reachable |= dp[r][c - 1][balance];
                    }

                    if (!reachable) {
                        continue;
                    }
                    int newBalance;

                    if (grid[r][c] == '(') {
                        newBalance = balance + 1;
                    } else {
                        newBalance = balance - 1;
                    }

                    if (newBalance < 0 || newBalance >= maxBalance) {
                        continue;
                    }
                    dp[r][c][newBalance] = true;
                }
            }
        }
        return dp[m - 1][n - 1][0];
    }
}