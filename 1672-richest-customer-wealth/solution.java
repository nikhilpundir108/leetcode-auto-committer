/*
 * Problem: Richest Customer Wealth (LeetCode #1672)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.3 MB (Beats 94.10%)
 * Solved At: 2026-09-01 10:38:08
 * Link: https://leetcode.com/problems/richest-customer-wealth/
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int max = 0;
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}