/*
 * Problem: Monotonic Array (LeetCode #896)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 18.35%)
 * Memory: 85.1 MB (Beats 78.64%)
 * Solved At: 2026-09-17 11:18:29 IST
 * Link: https://leetcode.com/problems/monotonic-array/
 */

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i] >= nums[i - 1])) {
                inc=false;
            } 
            if (!(nums[i] <= nums[i - 1])) {
                dec=false;
            } 
        }
        return inc || dec;
    }
}