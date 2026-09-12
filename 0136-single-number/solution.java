/*
 * Problem: Single Number (LeetCode #136)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.94%)
 * Memory: 46.9 MB (Beats 45.96%)
 * Solved At: 2026-09-10 05:42:34
 * Link: https://leetcode.com/problems/single-number/
 */

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}