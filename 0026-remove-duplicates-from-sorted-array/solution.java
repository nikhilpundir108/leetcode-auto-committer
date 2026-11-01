/*
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 82.21%)
 * Memory: 46.1 MB (Beats 91.08%)
 * Solved At: 2026-11-02 24:24:09 IST
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}