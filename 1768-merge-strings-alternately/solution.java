/*
 * Problem: Merge Strings Alternately (LeetCode #1768)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 97.62%)
 * Memory: 42.7 MB (Beats 65.28%)
 * Solved At: 2026-11-25 23:24:41 IST
 * Link: https://leetcode.com/problems/merge-strings-alternately/
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < n1 && j < n2) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < n1) {
            sb.append(word1.charAt(i));
            i++;
        }
        while (j < n2) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}