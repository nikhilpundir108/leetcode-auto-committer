/*
 * Problem: Product of Array Except Self (LeetCode #238)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 92.71%)
 * Memory: 64.5 MB (Beats 87.81%)
 * Solved At: 2026-11-08 17:15:54 IST
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pre = new int[n];
        int[] post = new int[n];
        pre[0] = 1;
        int prod = 1;
        for (int i = 1; i < n; i++) {
            prod *= nums[i - 1];
            ;
            pre[i] = prod;
        }
        post[n - 1] = 1;
        prod = 1;
        for (int i = n - 2; i >= 0; i--) {
            prod *= nums[i + 1];
            post[i] = prod;
        }

        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * post[i];
        }

        return ans;
    }
}