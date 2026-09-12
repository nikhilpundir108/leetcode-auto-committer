/*
 * Problem: A Number After a Double Reversal (LeetCode #2119)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42 MB (Beats 81.38%)
 * Solved At: 2026-09-09 04:58:58
 * Link: https://leetcode.com/problems/a-number-after-a-double-reversal/
 */

class Solution {
    public boolean isSameAfterReversals(int num) {
        int r1 = rev(num);
        int r2 = rev(r1);
        return num == r2;
    }

    public int rev(int n) {
        int rev = 0;
        while (n > 0) {
            int k = n % 10;
            rev = rev * 10 + k;
            n = n / 10;
        }
        return rev;
    }
}