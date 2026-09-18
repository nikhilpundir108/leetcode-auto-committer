/*
 * Problem: Count the Number of Vowel Strings in Range (LeetCode #2586)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 46.5 MB (Beats 28.80%)
 * Solved At: 2026-09-18 12:09:56 IST
 * Link: https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/
 */

class Solution {
    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int r = words[i].length() - 1;
            int l = 0;
            char chL = words[i].charAt(l);
            char chR = words[i].charAt(r);
            if (isVowel(chL) && isVowel(chR)) {
                count++;
            }
        }
        return count;
    }
}