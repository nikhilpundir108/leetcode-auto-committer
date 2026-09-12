/*
 * Problem: Sort Colors (LeetCode #75)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.8 MB (Beats 8.20%)
 * Solved At: 2026-09-11 10:11:30
 * Link: https://leetcode.com/problems/sort-colors/
 */

class Solution {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

}