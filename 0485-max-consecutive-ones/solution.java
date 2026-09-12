/*
 * Problem: Max Consecutive Ones (LeetCode #485)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 58.71%)
 * Memory: 52.7 MB (Beats 26.60%)
 * Solved At: 2026-08-03 17:26:00
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                temp++;
                max = Math.max(max, temp);
            }else{
                temp=0;
            }
        }
        return max;
    }
}