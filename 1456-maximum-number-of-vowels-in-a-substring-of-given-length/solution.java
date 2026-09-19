/*
 * Problem: Maximum Number of Vowels in a Substring of Given Length (LeetCode #1456)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 12 ms (Beats 81.48%)
 * Memory: 46.7 MB (Beats 17.70%)
 * Solved At: 2026-09-19 23:24:14 IST
 * Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 */

class Solution {
    public boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            if (isvowel(ch)) {
                count++;
            }
            if (r - l + 1 == k) {
                max = Math.max(count, max);
                if (isvowel(s.charAt(l))) {
                    count--;
                }
                l++;
            }
        }
        return max;
    }
}