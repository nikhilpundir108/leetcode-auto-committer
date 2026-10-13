/*
 * Problem: Maximum Alternating Sum of Squares (LeetCode #3727)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 33 ms (Beats 68.31%)
 * Memory: 138.1 MB (Beats 17.61%)
 * Solved At: 2026-10-13 14:06:25 IST
 * Link: https://leetcode.com/problems/maximum-alternating-sum-of-squares/
 */

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
            }
        }
        Arrays.sort(nums);
        int mid = n / 2;
        long sum = 0;
        for (int i = n - 1; i >= mid; i--) {
            int prod = nums[i] * nums[i];
            sum += prod;
        }
        for (int i = mid - 1; i >= 0; i--) {
            int prod = nums[i] * nums[i];
            sum -= prod;
        }
        return sum;
    }
}