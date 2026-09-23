/*
 * Problem: Find Peak Element (LeetCode #162)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.3 MB (Beats 38.57%)
 * Solved At: 2026-09-23 15:29:17 IST
 * Link: https://leetcode.com/problems/find-peak-element/
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        int l = 1;
        int h = nums.length - 2;
        while (l <= h) {
            if (nums[l] > nums[l - 1] && nums[l] > nums[l + 1]) {
                return l;
            }
            if (nums[h] > nums[h + 1] && nums[h] > nums[h - 1]) {
                return h;
            }
            l++;
            h--;
        }

        return -1;
    }
}