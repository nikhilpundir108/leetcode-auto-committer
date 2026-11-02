/*
 * Problem: Minimum Value of Merged Integers (LeetCode #4097)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms (Beats 100.00%)
 * Memory: 45.9 MB (Beats 66.67%)
 * Solved At: 2026-11-02 15:22:21 IST
 * Link: https://leetcode.com/problems/minimum-value-of-merged-integers/
 */

class Solution {
    public int merge(int m, int n) {
        String str = String.valueOf(m) + String.valueOf(n);
        int num = Integer.valueOf(str);
        return num;
    }

    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i += 2) {
            min = Math.min(min, merge(nums[i], nums[i + 1]));
        }
        return min;
    }
}