/*
 * Problem: Difference Between Peaks and Valleys (LeetCode #4088)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 85.64%)
 * Memory: 45.6 MB (Beats 74.40%)
 * Solved At: 2026-10-24 20:06:39 IST
 * Link: https://leetcode.com/problems/difference-between-peaks-and-valleys/
 */

class Solution {
    public int peak(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int valley(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int peakValleyDifference(int[] nums) {
        return peak(nums) - valley(nums);
    }
}