/*
 * Problem: Find Pivot Index (LeetCode #724)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 96.36%)
 * Memory: 47.3 MB (Beats 59.94%)
 * Solved At: 2026-09-02 08:41:20
 * Link: https://leetcode.com/problems/find-pivot-index/
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int leftSum=0;
        int l=0;
        int r=nums.length-1;
        
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }
}