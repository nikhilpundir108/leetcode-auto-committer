/*
 * Problem: Sum of Squares of Special Elements  (LeetCode #2778)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 46.6 MB (Beats 14.70%)
 * Solved At: 2026-10-11 18:32:08 IST
 * Link: https://leetcode.com/problems/sum-of-squares-of-special-elements/
 */

class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int prod = nums[i - 1] * nums[i - 1];
                ans += prod;
            }
        }
        return ans;
    }
}