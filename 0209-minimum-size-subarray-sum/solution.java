/*
 * Problem: Minimum Size Subarray Sum (LeetCode #209)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 99.81%)
 * Memory: 69.3 MB (Beats 28.09%)
 * Solved At: 2026-09-17 14:02:08 IST
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        for (int r = 0; r < n; r++) {
            sum += nums[r];
            while (sum >= target) {
                ans = Math.min(ans, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}