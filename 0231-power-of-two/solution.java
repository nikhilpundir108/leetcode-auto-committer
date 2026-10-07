/*
 * Problem: Power of Two (LeetCode #231)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 96.80%)
 * Memory: 42.4 MB (Beats 86.20%)
 * Solved At: 2026-10-07 15:22:03 IST
 * Link: https://leetcode.com/problems/power-of-two/
 */

class Solution {
    public boolean check(int n, int i) {
        if (i == 31) {
            return false;
        }
        int power = 1 << i;
        if (power > n) {
            return false;
        }
        if (power == n) {
            return true;
        }
        return check(n, i + 1);
    }

    public boolean isPowerOfTwo(int n) {
        if (n < 0) {
            return false;
        }
        return check(n, 0);
    }
}