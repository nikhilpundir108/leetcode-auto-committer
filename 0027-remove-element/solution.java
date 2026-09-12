/*
 * Problem: Remove Element (LeetCode #27)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.5 MB (Beats 61.06%)
 * Solved At: 2026-09-02 09:05:58
 * Link: https://leetcode.com/problems/remove-element/
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) {
            if (n != val) {
                nums[k] = n;
                k++;
            }
        }
        return k;
    }
}