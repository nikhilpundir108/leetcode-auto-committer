/*
 * Problem: Trapping Rain Water (LeetCode #42)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 1 ms (Beats 56.17%)
 * Memory: 48.9 MB (Beats 8.72%)
 * Solved At: 2026-09-11 10:24:47
 * Link: https://leetcode.com/problems/trapping-rain-water/
 */

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            int water = Math.min(leftmax[i], rightmax[i]);
            total += water - height[i];
        }
        return total;
    }
}