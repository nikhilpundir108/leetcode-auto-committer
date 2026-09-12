/*
 * Problem: Count the Digits That Divide a Number (LeetCode #2520)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.3 MB (Beats 18.01%)
 * Solved At: 2026-09-07 09:43:16
 * Link: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
 */

class Solution {
    public int countDigits(int num) {
        int count = 0;
        int n = num;
        while (num > 0) {
            int val = num % 10;
            if (n % val == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}