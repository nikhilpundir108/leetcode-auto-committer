/*
 * Problem: Number of Good Pairs (LeetCode #1512)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 84.79%)
 * Memory: 42.9 MB (Beats 43.08%)
 * Solved At: 2026-09-07 09:51:16
 * Link: https://leetcode.com/problems/number-of-good-pairs/
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}