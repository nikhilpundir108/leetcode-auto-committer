/*
 * Problem: Find if Digit Game Can Be Won (LeetCode #3232)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 91.69%)
 * Memory: 45.5 MB (Beats 37.46%)
 * Solved At: 2026-09-03 06:26:41
 * Link: https://leetcode.com/problems/find-if-digit-game-can-be-won/
 */

class Solution {
    public boolean canAliceWin(int[] nums) {
        int aSum = 0;
        int bSum = 0;
        for (int num : nums) {
            if (num < 10) {
                aSum += num;
            } else {
                bSum += num;
            }
        }
        if (aSum == bSum) {
            return false;
        }
        return true;
    }
}