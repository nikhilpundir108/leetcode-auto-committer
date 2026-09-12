/*
 * Problem: Rotate Array (LeetCode #189)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 67.25%)
 * Memory: 61.5 MB (Beats 61.35%)
 * Solved At: 2026-08-03 17:07:27
 * Link: https://leetcode.com/problems/rotate-array/
 */

class Solution {
    public void rotate(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int x = n - k;
        rotate(nums, 0, x - 1);
        rotate(nums, x, n - 1);
        rotate(nums, 0, n - 1);
    }
}