/*
 * Problem: Flipping an Image (LeetCode #832)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 47.01%)
 * Memory: 45.7 MB (Beats 72.72%)
 * Solved At: 2026-09-09 10:37:51
 * Link: https://leetcode.com/problems/flipping-an-image/
 */

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        for (int i = 0; i < row; i++) {
            int l = 0;
            int r = row - 1;
            while (l <= r) {
                int temp = image[i][l];
                image[i][l] = image[i][r];
                image[i][r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}