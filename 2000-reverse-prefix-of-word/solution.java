/*
 * Problem: Reverse Prefix of Word (LeetCode #2000)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 46.64%)
 * Memory: 43.1 MB (Beats 37.02%)
 * Solved At: 2026-09-10 05:26:01
 * Link: https://leetcode.com/problems/reverse-prefix-of-word/
 */

class Solution {
    public String reversePrefix(String word, char ch) {
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                ans = word.substring(0, i + 1);
                return rev(ans) + word.substring(i + 1, word.length());
            }
        }
        return word;
    }

    public String rev(String ans) {
        String rev = new StringBuilder(ans).reverse().toString();
        return rev;
    }
}