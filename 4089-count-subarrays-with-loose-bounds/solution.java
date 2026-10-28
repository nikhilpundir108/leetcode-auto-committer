/*
 * Problem: Count Subarrays With Loose Bounds (LeetCode #4089)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms (Beats 98.79%)
 * Memory: 196 MB (Beats 78.00%)
 * Solved At: 2026-10-24 20:11:07 IST
 * Link: https://leetcode.com/problems/count-subarrays-with-loose-bounds/
 */

class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        long len = 0;
        for (int num : nums) {
            if (num >= minK && num <= maxK) {
                len++;
                count += len;
            } else {
                len = 0;
            }
        }
        return count;
    }
}