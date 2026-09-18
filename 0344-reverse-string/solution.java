/*
 * Problem: Reverse String (LeetCode #344)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 48.2 MB (Beats 73.72%)
 * Solved At: 2026-09-18 10:04:25 IST
 * Link: https://leetcode.com/problems/reverse-string/
 */

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}