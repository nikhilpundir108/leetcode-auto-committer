/*
 * Problem: Minimum Moves to Equal Array Elements (LeetCode #453)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 96.51%)
 * Memory: 46.6 MB (Beats 74.90%)
 * Solved At: 2026-11-03 18:54:22 IST
 * Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */

class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(num, min);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += nums[i] - min;
        }
        return count;
    }
}