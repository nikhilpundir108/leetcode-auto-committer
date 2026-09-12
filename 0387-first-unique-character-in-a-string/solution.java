/*
 * Problem: First Unique Character in a String (LeetCode #387)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 35 ms (Beats 12.87%)
 * Memory: 46.9 MB (Beats 57.81%)
 * Solved At: 2026-09-10 06:23:01
 * Link: https://leetcode.com/problems/first-unique-character-in-a-string/
 */

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}