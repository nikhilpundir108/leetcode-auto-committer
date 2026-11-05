/*
 * Problem: Max Consecutive Ones (LeetCode #485)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 58.81%)
 * Memory: 52 MB (Beats 84.75%)
 * Solved At: 2026-11-05 20:40:58 IST
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