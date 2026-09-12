/*
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 76.85%)
 * Memory: 46.8 MB (Beats 42.79%)
 * Solved At: 2026-09-02 10:21:08
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
           }
        }
        return k;
    }
}