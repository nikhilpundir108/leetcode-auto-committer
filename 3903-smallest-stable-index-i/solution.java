/*
 * Problem: Smallest Stable Index I (LeetCode #3903)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.39%)
 * Memory: 45.9 MB (Beats 97.69%)
 * Solved At: 2026-11-03 19:50:44 IST
 * Link: https://leetcode.com/problems/smallest-stable-index-i/
 */

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];

        int min = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            suffix[i] = min;
        }
        int ans = -1;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if ((max - suffix[i]) <= k) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}