/*
 * Problem: Image Smoother (LeetCode #661)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 7 ms (Beats 23.49%)
 * Memory: 47.7 MB (Beats 86.77%)
 * Solved At: 2026-09-10 10:05:17
 * Link: https://leetcode.com/problems/image-smoother/
 */

class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int ans = 0;
        int[] row = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] col = { -1, 0, 1, -1, 1, -1, 0, 1 };
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 1;
                int sum = img[i][j];
                for (int k = 0; k < 8; k++) {
                    int newRow = i + row[k];
                    int newCol = j + col[k];
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                        sum += img[newRow][newCol];
                        count++;
                    }
                }
                res[i][j] = sum / count;

            }
        }
        return res;
    }
}