/*
 * Problem: Reverse String (LeetCode #344)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 48.3 MB (Beats 37.90%)
 * Solved At: 2026-02-20 08:46:14
 * Link: https://leetcode.com/problems/reverse-string/
 */

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left ++;
            right --;
        }
    }
}