/*
 * Problem: Power of Two (LeetCode #231)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 96.69%)
 * Memory: 42.4 MB (Beats 86.21%)
 * Solved At: 2026-10-01 22:10:10 IST
 * Link: https://leetcode.com/problems/power-of-two/
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}