/*
 * Problem: Power of Three (LeetCode #326)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 8 ms (Beats 92.10%)
 * Memory: 45.9 MB (Beats 82.67%)
 * Solved At: 2026-10-07 15:25:25 IST
 * Link: https://leetcode.com/problems/power-of-three/
 */

class Solution {
    public boolean check(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 3 != 0) {
            return false;
        }
        return check(n / 3);
    }

    public boolean isPowerOfThree(int n) {
        return check(n);
    }
}