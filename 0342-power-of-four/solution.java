/*
 * Problem: Power of Four (LeetCode #342)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 89.97%)
 * Memory: 42.6 MB (Beats 33.28%)
 * Solved At: 2026-09-08 09:52:52
 * Link: https://leetcode.com/problems/power-of-four/
 */

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}