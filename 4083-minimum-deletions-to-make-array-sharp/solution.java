/*
 * Problem: Minimum Deletions to Make Array Sharp (LeetCode #4083)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 46.1 MB (Beats 9.51%)
 * Solved At: 2026-10-18 15:33:45 IST
 * Link: https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/
 */

class Solution {
    public int minDeletions(int[] nums) {
        int count = 0;
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last) {
                count++;
            } else {
                last = nums[i];
            }
        }
        return count;
    }
}