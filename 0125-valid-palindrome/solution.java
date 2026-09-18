/*
 * Problem: Valid Palindrome (LeetCode #125)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 56.09%)
 * Memory: 44.4 MB (Beats 53.27%)
 * Solved At: 2026-09-18 11:15:56 IST
 * Link: https://leetcode.com/problems/valid-palindrome/
 */

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}