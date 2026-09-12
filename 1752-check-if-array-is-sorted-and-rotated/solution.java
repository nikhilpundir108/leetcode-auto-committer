/*
 * Problem: Check if Array Is Sorted and Rotated (LeetCode #1752)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.8 MB (Beats 81.53%)
 * Solved At: 2026-03-29 15:07:45
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

        }
        return count <= 1;
    }
}