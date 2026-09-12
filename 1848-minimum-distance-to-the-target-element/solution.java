/*
 * Problem: Minimum Distance to the Target Element (LeetCode #1848)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 68.59%)
 * Memory: 45.1 MB (Beats 38.21%)
 * Solved At: 2026-09-08 10:20:23
 * Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/
 */

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int idx = 0;
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                minDist = Math.min(Math.abs(i - start), minDist);
            }
        }
        return minDist;
    }
}