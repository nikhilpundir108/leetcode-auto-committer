/*
 * Problem: Maximum Subarray (LeetCode #53)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 99.92%)
 * Memory: 77.4 MB (Beats 32.68%)
 * Solved At: 2026-08-04 03:34:09
 * Link: https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public int maxSubArray(int[] nums) {

        int currSum = 0;
        int maxSum = nums[0];

        for (int num : nums) {

            if (currSum < 0)
                currSum = 0;

            currSum += num;

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}