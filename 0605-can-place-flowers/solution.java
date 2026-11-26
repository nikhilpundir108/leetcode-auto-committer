/*
 * Problem: Can Place Flowers (LeetCode #605)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.50%)
 * Memory: 47.7 MB (Beats 31.33%)
 * Solved At: 2026-11-25 23:44:54 IST
 * Link: https://leetcode.com/problems/can-place-flowers/
 */


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {

            if (n == 0) {
                return true;
            }

            if (flowerbed[i] == 0) {

                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);

                boolean rightEmpty = (i == len - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
