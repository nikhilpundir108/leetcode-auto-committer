/*
 * Problem: Longest Strictly Increasing or Strictly Decreasing Subarray (LeetCode #3105)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.95%)
 * Memory: 43.8 MB (Beats 76.65%)
 * Solved At: 2026-11-12 15:14:06 IST
 * Link: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
 */

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int incLen = 1;
        int decLen = 1;
        int maxLen = 1;
        int i = 1;
        while (i < n) {
            if (nums[i] > nums[i - 1]) {
                incLen++;
                decLen = 1;
            } else if (nums[i] < nums[i - 1]) {
                decLen++;
                incLen = 1;
            } else {
                incLen = 1;
                decLen = 1;
            }
            i++;
            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }
        return maxLen;
    }
}