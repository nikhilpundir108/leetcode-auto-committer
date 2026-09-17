/*
 * Problem: Minimum Difference Between Highest and Lowest of K Scores (LeetCode #1984)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 8 ms (Beats 90.31%)
 * Memory: 47.1 MB (Beats 15.71%)
 * Solved At: 2026-09-17 15:17:21 IST
 * Link: https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}