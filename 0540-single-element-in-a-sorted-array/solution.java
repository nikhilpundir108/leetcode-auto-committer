/*
 * Problem: Single Element in a Sorted Array (LeetCode #540)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 52.6 MB (Beats 89.77%)
 * Solved At: 2026-03-27 07:43:22
 * Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
 */

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                low=mid+2;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
}