/*
 * Problem: Can Make Arithmetic Progression From Sequence (LeetCode #1502)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms (Beats 84.01%)
 * Memory: 43.3 MB (Beats 96.27%)
 * Solved At: 2026-11-06 14:15:16 IST
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