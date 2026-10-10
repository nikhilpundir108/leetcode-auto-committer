/*
 * Problem: Is Subsequence (LeetCode #392)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 95.81%)
 * Memory: 42.9 MB (Beats 46.05%)
 * Solved At: 2026-10-10 14:46:22 IST
 * Link: https://leetcode.com/problems/is-subsequence/
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int l = 0;
        int r = 0;
        while (l != n1 && r != n2) {
            char ch1 = s.charAt(l);
            char ch2 = t.charAt(r);
            if (ch1 == ch2) {
                l++;
                r++;
            } else {
                r++;
            }
        }
        return l == n1;
    }
}