/*
 * Problem: Sqrt(x) (LeetCode #69)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.13%)
 * Memory: 42.6 MB (Beats 61.45%)
 * Solved At: 2026-09-13 00:16:17
 * Link: https://leetcode.com/problems/sqrtx/
 */

class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int l = 1;
        int h = x / 2;
        int ans = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}