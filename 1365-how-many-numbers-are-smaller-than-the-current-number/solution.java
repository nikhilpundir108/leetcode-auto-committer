/*
 * Problem: How Many Numbers Are Smaller Than the Current Number (LeetCode #1365)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 7 ms (Beats 83.53%)
 * Memory: 45.7 MB (Beats 19.18%)
 * Solved At: 2026-09-15 10:53:38 IST
 * Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int k = nums[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < k) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}