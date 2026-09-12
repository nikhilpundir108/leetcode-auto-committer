/*
 * Problem: Missing Number (LeetCode #268)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 9 ms (Beats 7.75%)
 * Memory: 48.1 MB (Beats 8.16%)
 * Solved At: 2026-08-05 21:24:05
 * Link: https://leetcode.com/problems/missing-number/
 */

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        int n = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                return nums[i] - 1;
            }
        }
        return n;
    }
}