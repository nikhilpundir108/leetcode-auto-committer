/*
 * Problem: Find First Palindromic String in the Array (LeetCode #2108)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 47.6 MB (Beats 48.06%)
 * Solved At: 2026-09-08 08:56:11
 * Link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
 */

class Solution {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (isPalindrome(s)) {
                return s;
            }
        }
            return new String("");
    }

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}