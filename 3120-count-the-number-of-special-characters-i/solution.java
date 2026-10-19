/*
 * Problem: Count the Number of Special Characters I (LeetCode #3120)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 49.15%)
 * Memory: 43 MB (Beats 96.95%)
 * Solved At: 2026-10-19 14:08:42 IST
 * Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
 */

class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (word.indexOf(ch) != -1 && word.indexOf(Character.toUpperCase(ch)) != -1) {
                count++;
            }
        }
        return count;
    }
}