/*
 * Problem: Container With Most Water (LeetCode #11)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms (Beats 82.92%)
 * Memory: 77.2 MB (Beats 68.94%)
 * Solved At: 2026-08-19 06:13:50
 * Link: https://leetcode.com/problems/container-with-most-water/
 */

class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxArea = 0;
        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            int Area = w * h;
            maxArea = Math.max(Area, maxArea);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}