/*
 * Problem: Check if the Sentence Is Pangram (LeetCode #1832)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms (Beats 20.22%)
 * Memory: 43 MB (Beats 51.47%)
 * Solved At: 2026-09-08 06:23:34
 * Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */

class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}