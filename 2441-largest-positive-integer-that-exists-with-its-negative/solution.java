/*
 * Problem: Largest Positive Integer That Exists With Its Negative (LeetCode #2441)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms (Beats 82.86%)
 * Memory: 46.9 MB (Beats 69.11%)
 * Solved At: 2026-09-12 20:26:13
 * Link: https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
 */

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(-nums[i])) {
                if (nums[i] < 0) {
                    nums[i] = -nums[i];
                }
                max = Math.max(max, nums[i]);
            }
            set.add(nums[i]);
        }
        return max;
    }
}