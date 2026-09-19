/*
 * Problem: Binary Subarrays With Sum (LeetCode #930)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 99.98%)
 * Memory: 51 MB (Beats 42.97%)
 * Solved At: 2026-09-20 24:22:56 IST
 * Link: https://leetcode.com/problems/binary-subarrays-with-sum/
 */

class Solution {
    private int atMost(int[] nums, int goal) {
        if(goal<0){
            return 0;
        }
        int sum = 0;
        int count = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
}