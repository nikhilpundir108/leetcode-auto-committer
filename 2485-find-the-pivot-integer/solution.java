/*
 * Problem: Find the Pivot Integer (LeetCode #2485)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 38 ms (Beats 9.13%)
 * Memory: 41.8 MB (Beats 79.57%)
 * Solved At: 2026-11-13 15:58:00 IST
 * Link: https://leetcode.com/problems/find-the-pivot-integer/
 */


class Solution {
    public int pivotInteger(int n) {

        for (int x = 1; x <= n; x++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 1; i <= x; i++) {
                leftSum += i;
            }

         
            for (int i = x; i <= n; i++) {
                rightSum += i;
            }

            if (leftSum == rightSum) {
                return x;
            }
        }

        return -1;
    }
}
