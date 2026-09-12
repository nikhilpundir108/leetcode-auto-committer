/*
 * Problem: Power of Three (LeetCode #326)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 8 ms (Beats 92.48%)
 * Memory: 46.3 MB (Beats 10.54%)
 * Solved At: 2026-09-08 09:37:48
 * Link: https://leetcode.com/problems/power-of-three/
 */

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}