/*
 * Problem: Smallest Integer Divisible by K (LeetCode #1015)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 99.60%)
 * Memory: 41.8 MB (Beats 68.72%)
 * Solved At: 2026-11-13 20:16:51 IST
 * Link: https://leetcode.com/problems/smallest-integer-divisible-by-k/
 */


class Solution {
    public int smallestRepunitDivByK(int k) {

        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int rem = 0;

        for (int len = 1; len <= k; len++) {

            rem = (rem * 10 + 1) % k;

            if (rem == 0) {
                return len;
            }
        }

        return -1;
    }
}
