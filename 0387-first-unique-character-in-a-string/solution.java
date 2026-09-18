/*
 * Problem: First Unique Character in a String (LeetCode #387)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms (Beats 85.64%)
 * Memory: 46.8 MB (Beats 72.56%)
 * Solved At: 2026-09-18 11:29:23 IST
 * Link: https://leetcode.com/problems/first-unique-character-in-a-string/
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}