/*
 * Problem: Ugly Number (LeetCode #263)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.45%)
 * Memory: 42.1 MB (Beats 80.78%)
 * Solved At: 2026-11-13 19:57:03 IST
 * Link: https://leetcode.com/problems/ugly-number/
 */

class Solution {
    public boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}