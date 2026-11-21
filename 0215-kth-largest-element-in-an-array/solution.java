/*
 * Problem: Kth Largest Element in an Array (LeetCode #215)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 31 ms (Beats 90.53%)
 * Memory: 75.5 MB (Beats 24.43%)
 * Solved At: 2026-11-21 20:02:12 IST
 * Link: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */


class Solution {
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}
