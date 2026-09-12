/*
 * Problem: Number of Arithmetic Triplets (LeetCode #2367)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 85.42%)
 * Memory: 43.1 MB (Beats 74.84%)
 * Solved At: 2026-09-12 19:59:38
 * Link: https://leetcode.com/problems/number-of-arithmetic-triplets/
 */

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j + 1; k < n; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}