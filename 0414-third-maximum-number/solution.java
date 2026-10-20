/*
 * Problem: Third Maximum Number (LeetCode #414)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 98.70%)
 * Memory: 44.1 MB (Beats 98.07%)
 * Solved At: 2026-10-20 15:30:17 IST
 * Link: https://leetcode.com/problems/third-maximum-number/
 */

class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        int i = 0;
        for (int num : nums) {
            if (num == a || num == b || num == c) {
                continue;
            }
            if (num > a) {
                c = b;
                b = a;
                a = num;
            } else if (num > b) {
                c = b;
                b = num;
            } else if (num > c) {
                c = num;
            }
        }
        return c == Long.MIN_VALUE ? (int) a : (int) c;
    }
}