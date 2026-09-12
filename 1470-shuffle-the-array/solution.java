/*
 * Problem: Shuffle the Array (LeetCode #1470)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.8 MB (Beats 7.40%)
 * Solved At: 2026-09-01 10:29:36
 * Link: https://leetcode.com/problems/shuffle-the-array/
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[2 * n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            res[idx++] = nums[i];
            res[idx++] = nums[n + i];
        }
        return res;
    }
}