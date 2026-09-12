/*
 * Problem: Power of Two (LeetCode #231)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 96.65%)
 * Memory: 41.6 MB (Beats 99.86%)
 * Solved At: 2026-09-08 09:43:18
 * Link: https://leetcode.com/problems/power-of-two/
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}