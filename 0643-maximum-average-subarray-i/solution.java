/*
 * Problem: Maximum Average Subarray I (LeetCode #643)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms (Beats 31.83%)
 * Memory: 69.4 MB (Beats 88.02%)
 * Solved At: 2026-07-11 17:58:09
 * Link: https://leetcode.com/problems/maximum-average-subarray-i/
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int n = nums.length;
        
        double sum = 0;
        
        // Step 1: first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Step 2: sliding window
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        // Step 3: return average
        return maxSum / k;
    }
}