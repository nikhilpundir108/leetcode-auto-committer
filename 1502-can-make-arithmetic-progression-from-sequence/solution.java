/*
 * Problem: Can Make Arithmetic Progression From Sequence (LeetCode #1502)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms (Beats 83.20%)
 * Memory: 44.1 MB (Beats 57.59%)
 * Solved At: 2026-09-17 11:31:47 IST
 * Link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 */

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean ans = true;
        int k = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != k) {
                return false;
            }
        }
        return true;
    }
}