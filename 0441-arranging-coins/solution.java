/*
 * Problem: Arranging Coins (LeetCode #441)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 42.9 MB (Beats 10.25%)
 * Solved At: 2026-09-20 22:19:19 IST
 * Link: https://leetcode.com/problems/arranging-coins/
 */

class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long r = n;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long coins = mid * (mid + 1) / 2;
            if (coins == n) {
                return (int) mid;
            } else if (coins < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return (int) r;
    }
}