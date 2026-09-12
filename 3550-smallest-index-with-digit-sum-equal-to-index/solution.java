/*
 * Problem: Smallest Index With Digit Sum Equal to Index (LeetCode #3550)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.71%)
 * Memory: 45.4 MB (Beats 89.05%)
 * Solved At: 2026-09-01 10:44:39
 * Link: https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/
 */

class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int sum = 0;
            while (n != 0) {
                int s = n % 10;
                sum = sum + s;
                n = n / 10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}