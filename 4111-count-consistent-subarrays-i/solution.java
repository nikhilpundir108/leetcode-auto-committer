/*
 * Problem: Count Consistent Subarrays I (LeetCode #4111)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 100.00%)
 * Memory: 45.7 MB (Beats 81.32%)
 * Solved At: 2026-11-16 22:39:59 IST
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