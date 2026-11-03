/*
 * Problem: Minimum Moves to Equal Array Elements III (LeetCode #3736)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 32.65%)
 * Memory: 45.7 MB (Beats 91.53%)
 * Solved At: 2026-11-03 19:06:43 IST
 * Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/
 */

class Solution {
    public int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = max(nums);
        int count = 0;
        for (int num : nums) {
            if (num != max) {
                count += max - num;
            }
        }
        return count;
    }
}