/*
 * Problem: Concatenation of Array (LeetCode #1929)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 97.71%)
 * Memory: 47.1 MB (Beats 76.07%)
 * Solved At: 2026-09-02 08:58:04
 * Link: https://leetcode.com/problems/concatenation-of-array/
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i + n] = nums[i];
        }
        return res;
    }
}