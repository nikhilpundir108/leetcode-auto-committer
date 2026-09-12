/*
 * Problem: Rearrange Array Elements by Sign (LeetCode #2149)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 4 ms (Beats 40.53%)
 * Memory: 175.3 MB (Beats 75.41%)
 * Solved At: 2026-08-04 04:00:48
 * Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int negIdx = 1;
        int posIdx = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[negIdx] = nums[i];
                negIdx += 2;
            } else {
                ans[posIdx] = nums[i];
                posIdx += 2;
            }
        }
        return ans;
    }
}