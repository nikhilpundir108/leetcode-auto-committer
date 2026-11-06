/*
 * Problem: Palindrome Number (LeetCode #9)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 15 ms (Beats 13.37%)
 * Memory: 45.1 MB (Beats 97.88%)
 * Solved At: 2026-11-06 14:18:22 IST
 * Link: https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}