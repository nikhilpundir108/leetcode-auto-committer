/*
 * Problem: Mirror Distance of an Integer (LeetCode #3783)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.86%)
 * Memory: 42.6 MB (Beats 41.69%)
 * Solved At: 2026-09-08 10:25:59
 * Link: https://leetcode.com/problems/mirror-distance-of-an-integer/
 */

class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int rev = 0;
        while (num > 0) {
            int k = num % 10;
            rev = rev * 10 + k;
            num = num / 10;
        }
        return Math.abs(rev-n);
    }
}