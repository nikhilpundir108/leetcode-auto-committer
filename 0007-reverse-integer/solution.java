/*
 * Problem: Reverse Integer (LeetCode #7)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 99.97%)
 * Memory: 42.8 MB (Beats 26.87%)
 * Solved At: 2026-09-20 03:05:40 IST
 * Link: https://leetcode.com/problems/reverse-integer/
 */

class Solution {
    public int reverse(int x) {
        long X = x > 0 ? x : -(long) x;
        long rev = 0;
        while (X > 0) {
            long k = X % 10;
            rev = rev * 10 + k;
            X = X / 10;
        }
        if (x < 0) {
            rev = -rev;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}