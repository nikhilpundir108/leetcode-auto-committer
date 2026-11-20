/*
 * Problem: Minimum Score by Changing Two Elements (LeetCode #2567)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 18 ms (Beats 71.34%)
 * Memory: 59.4 MB (Beats 39.71%)
 * Solved At: 2026-11-20 23:07:25 IST
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