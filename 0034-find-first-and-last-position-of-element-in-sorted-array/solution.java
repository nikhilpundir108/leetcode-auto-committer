/*
 * Problem: Find First and Last Position of Element in Sorted Array (LeetCode #34)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 47.7 MB (Beats 74.83%)
 * Solved At: 2026-11-22 13:11:15 IST
 * Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1;
        int second = -1;

        int l = 0;
        int h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                first = mid;
                h = mid - 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        l = 0;
        h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                second = mid;
                l = mid + 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return new int[] { first, second };
    }
}