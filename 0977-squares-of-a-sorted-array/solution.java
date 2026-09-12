/*
 * Problem: Squares of a Sorted Array (LeetCode #977)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 46.9 MB (Beats 93.88%)
 * Solved At: 2026-09-09 08:32:18
 * Link: https://leetcode.com/problems/squares-of-a-sorted-array/
 */

class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int leftsq = nums[l] * nums[l];
            int rightsq = nums[r] * nums[r];
            if (leftsq > rightsq) {
                res[i] = leftsq;
                l++;
            } else {
                res[i] = rightsq;
                r--;
            }
        }
        return res;
    }
}