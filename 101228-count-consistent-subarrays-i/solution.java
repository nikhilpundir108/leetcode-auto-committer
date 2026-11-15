/*
 * Problem: Count Consistent Subarrays I (LeetCode #101228)
 * Difficulty: Unknown
 * Language: Java
 * Runtime: 2 ms (Beats 100.00%)
 * Memory: 46 MB (Beats 66.67%)
 * Solved At: 2026-11-15 08:55:32 IST
 * Link: https://leetcode.com/problems/count-consistent-subarrays-i/
 */

class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int val = -1;
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                val &= nums[j];
                min = Math.min(min, nums[j]);

                if (min == val) {
                    ans++;
                }
            }
        }
        return ans;
    }
}