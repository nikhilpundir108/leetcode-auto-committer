/*
 * Problem: Find the Width of Columns of a Grid (LeetCode #2639)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms (Beats 78.08%)
 * Memory: 46.9 MB (Beats 93.38%)
 * Solved At: 2026-09-09 06:45:45
 * Link: https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/
 */

class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for (int i = 0; i < grid.length; i++) {
                max = Math.max(max, count(grid[i][j]));
            }
            res[j] = max;
        }
        return res;
    }

    public int count(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            count++; // '-' sign
            num = -num;
        }
        while (num > 0) {
            int k = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
}