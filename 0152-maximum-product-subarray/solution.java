/*
 * Problem: Maximum Product Subarray (LeetCode #152)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 298 ms (Beats 5.07%)
 * Memory: 47.1 MB (Beats 72.84%)
 * Solved At: 2026-09-15 16:03:05 IST
 * Link: https://leetcode.com/problems/maximum-product-subarray/
 */

class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                maxProd = Math.max(maxProd, prod);
            }
        }
        return maxProd;
    }
}