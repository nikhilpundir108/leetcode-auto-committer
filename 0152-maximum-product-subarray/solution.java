/*
 * Problem: Maximum Product Subarray (LeetCode #152)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 71.64%)
 * Memory: 47.1 MB (Beats 87.40%)
 * Solved At: 2026-09-23 12:13:09 IST
 * Link: https://leetcode.com/problems/maximum-product-subarray/
 */

class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(curr, curr * max);
            min = Math.min(curr, curr * min);
            res = Math.max(max, res);
        }
        return res;
    }
}