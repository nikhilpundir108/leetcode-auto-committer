/*
 * Problem: Reverse Words in a String (LeetCode #151)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms (Beats 62.96%)
 * Memory: 43.8 MB (Beats 96.81%)
 * Solved At: 2026-07-31 07:25:48
 * Link: https://leetcode.com/problems/reverse-words-in-a-string/
 */

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}