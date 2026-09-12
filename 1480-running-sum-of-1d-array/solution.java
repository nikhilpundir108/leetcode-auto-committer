/*
 * Problem: Running Sum of 1d Array (LeetCode #1480)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.9 MB (Beats 96.63%)
 * Solved At: 2026-09-01 10:14:49
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/
 */

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
           nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}