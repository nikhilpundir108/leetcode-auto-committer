/*
 * Problem: Smallest Even Multiple (LeetCode #2413)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.4 MB (Beats 13.27%)
 * Solved At: 2026-09-09 05:49:05
 * Link: https://leetcode.com/problems/smallest-even-multiple/
 */

class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = n;
        while (true) {
            if (ans % 2 == 0 && ans % n == 0) {
                return ans;
            }
            ans++;
        }
    }
}