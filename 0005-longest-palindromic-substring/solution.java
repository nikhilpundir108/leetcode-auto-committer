/*
 * Problem: Longest Palindromic Substring (LeetCode #5)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 149 ms (Beats 22.28%)
 * Memory: 43.2 MB (Beats 83.25%)
 * Solved At: 2026-11-04 15:09:43 IST
 * Link: https://leetcode.com/problems/longest-palindromic-substring/
 */

class Solution {
    public boolean solve(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();

        for (int len = n; len >= 1; len--) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;

                if (solve(s, i, j)) {
                    return s.substring(i, j + 1);
                }
            }
        }

        return "";
    }
}