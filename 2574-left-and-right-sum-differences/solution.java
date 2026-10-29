/*
 * Problem: Left and Right Sum Differences (LeetCode #2574)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 98.69%)
 * Memory: 45.9 MB (Beats 92.63%)
 * Solved At: 2026-10-29 11:53:41 IST
 * Link: https://leetcode.com/problems/left-and-right-sum-differences/
 */

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int right = sum;
        for (int i = 0; i < n; i++) {
            right -= nums[i];
            rightSum[i] = right;
        }

        for (int i = n - 1; i >= 0; i--) {
            sum -= nums[i];
            leftSum[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}