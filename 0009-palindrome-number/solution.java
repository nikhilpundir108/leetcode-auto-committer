/*
 * Problem: Palindrome Number (LeetCode #9)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms (Beats 22.60%)
 * Memory: 46 MB (Beats 33.33%)
 * Solved At: 2026-09-20 02:50:07 IST
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