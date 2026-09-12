/*
 * Problem: Valid Palindrome (LeetCode #125)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 14 ms (Beats 28.29%)
 * Memory: 45.2 MB (Beats 35.67%)
 * Solved At: 2025-10-03 04:50:53
 * Link: https://leetcode.com/problems/valid-palindrome/
 */

class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      s= s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i) ){
                return false;
            }
        }
        return true;
    }
}