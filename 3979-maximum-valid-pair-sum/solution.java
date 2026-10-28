/*
 * Problem: Maximum Valid Pair Sum (LeetCode #3979)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 51.82%)
 * Memory: 118.6 MB (Beats 74.09%)
 * Solved At: 2026-10-28 11:26:03 IST
 * Link: https://leetcode.com/problems/maximum-valid-pair-sum/
 */

class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int leftMax = Integer.MIN_VALUE;

        for (int i = k; i < n; i++) {
            leftMax = Math.max(leftMax, nums[i - k]);
            maxSum = Math.max(maxSum, nums[i] + leftMax);
        }
        return maxSum;
    }
}