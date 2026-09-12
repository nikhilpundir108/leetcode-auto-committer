/*
 * Problem: Add Digits (LeetCode #258)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 98.07%)
 * Memory: 42.4 MB (Beats 80.08%)
 * Solved At: 2026-09-08 06:47:16
 * Link: https://leetcode.com/problems/add-digits/
 */

class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }
}