/*
 * Problem: Valid Anagram (LeetCode #242)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 18 ms (Beats 13.43%)
 * Memory: 46.8 MB (Beats 9.05%)
 * Solved At: 2026-09-10 06:06:04
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            if (map.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }
}