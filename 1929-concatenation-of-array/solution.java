/*
 * Problem: Concatenation of Array (LeetCode #1929)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 97.58%)
 * Memory: 46.8 MB (Beats 80.12%)
 * Solved At: 2026-11-05 20:39:48 IST
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