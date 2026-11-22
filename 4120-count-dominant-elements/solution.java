/*
 * Problem: Count Dominant Elements (LeetCode #4120)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 46.1 MB (Beats 32.89%)
 * Solved At: 2026-11-22 08:37:29 IST
 * Link: https://leetcode.com/problems/count-dominant-elements/
 */

class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length;
        int count = 0;
        if (n == 1) {
            return 1;
        }
        if (nums[0] >= nums[1]) {
            count++;
        }
        if (nums[n - 1] >= nums[n - 2]) {
            count++;
        }

        for (int i = 1; i <= n - 2; i++) {
            if ((2L * nums[i] >= (long) nums[i - 1] + nums[i + 1])) {
                count++;
            }
        }

        return count;
    }
}