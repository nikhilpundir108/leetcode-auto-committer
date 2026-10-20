/*
 * Problem: Missing Number (LeetCode #268)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.9 MB (Beats 92.48%)
 * Solved At: 2026-10-20 15:17:06 IST
 * Link: https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n;
        for (int i = 0; i < n; i++) {
            ans ^= i ^ nums[i];
        }
        return ans;
    }
}