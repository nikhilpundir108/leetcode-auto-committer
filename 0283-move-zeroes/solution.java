/*
 * Problem: Move Zeroes (LeetCode #283)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 91.70%)
 * Memory: 48 MB (Beats 20.31%)
 * Solved At: 2026-09-02 09:21:43
 * Link: https://leetcode.com/problems/move-zeroes/
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
    }
}