/*
 * Problem: Maximum Number of Balls in a Box (LeetCode #1742)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 16 ms (Beats 54.47%)
 * Memory: 42.1 MB (Beats 76.74%)
 * Solved At: 2026-09-09 09:00:34
 * Link: https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
 */

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] res = new int[50];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int k = sum(i);
            res[k] = res[k] + 1;
            max = Math.max(max, res[k]);
        }

        return max;
    }

    public int sum(int n) {
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            sum = sum + k;
            n = n / 10;
        }
        return sum;
    }
}