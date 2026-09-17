/*
 * Problem: Subarray Product Less Than K (LeetCode #713)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 99.96%)
 * Memory: 48.7 MB (Beats 87.25%)
 * Solved At: 2026-09-17 16:15:32 IST
 * Link: https://leetcode.com/problems/subarray-product-less-than-k/
 */

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int n = nums.length;
        int prod = 1;
        int count = 0;
        if (k <= 1) {
            return 0;
        }
        for (int r = 0; r < n; r++) {
            prod *= nums[r];
            while (prod >= k) {
                prod /= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}