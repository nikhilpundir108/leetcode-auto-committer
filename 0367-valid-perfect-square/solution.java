/*
 * Problem: Valid Perfect Square (LeetCode #367)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 41.8 MB (Beats 87.32%)
 * Solved At: 2026-10-04 22:39:58 IST
 * Link: https://leetcode.com/problems/valid-perfect-square/
 */

class Solution {
    public boolean isPerfectSquare(int num) {

        long low = 1;
        long high = num;

        while (low <= high) {

            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            }
            else if (square < num) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}