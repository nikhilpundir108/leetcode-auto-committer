/*
 * Problem: Find Greatest Common Divisor of Array (LeetCode #1979)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.8 MB (Beats 94.33%)
 * Solved At: 2026-09-03 06:50:00
 * Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/
 */

class Solution {
    public int findGCD(int[] nums) {
        int small = nums[0];
        int large = nums[0];

        for (int i = 1; i < nums.length; i++) {
           small=Math.min(small,nums[i]);
           large=Math.max(large,nums[i]);
        }
        for (int i = small; i >= 1; i--) {
            if (large % i == 0 && small % i == 0) {
                return i;
            }
        }
        return 1;
    }
}