/*
 * Problem: Binary Search (LeetCode #704)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 48.5 MB (Beats 13.94%)
 * Solved At: 2026-03-24 04:11:34
 * Link: https://leetcode.com/problems/binary-search/
 */

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target ) {
                return mid;
            } else if (nums[mid]<target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
}