/*
 * Problem: Minimum Score by Changing Two Elements (LeetCode #2567)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 19 ms (Beats 33.33%)
 * Memory: 59.5 MB (Beats 46.87%)
 * Solved At: 2026-11-19 20:21:00 IST
 * Link: https://leetcode.com/problems/minimum-score-by-changing-two-elements/
 */

class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int case1 = nums[n - 1] - nums[2];
        int case2 = nums[n - 2] - nums[1];
        int case3 = nums[n - 3] - nums[0];

        int ans = Math.min(case1, Math.min(case2, case3));
        return ans;
    }
}