/*
 * Problem: Palindrome Number (LeetCode #9)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 7 ms (Beats 10.80%)
 * Memory: 46.1 MB (Beats 33.01%)
 * Solved At: 2026-09-07 10:55:28
 * Link: https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}