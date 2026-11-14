/*
 * Problem: Word Pattern (LeetCode #290)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 88.20%)
 * Memory: 42.3 MB (Beats 83.98%)
 * Solved At: 2026-11-11 15:26:18 IST
 * Link: https://leetcode.com/problems/word-pattern/
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if (pattern.length() != word.length)
            return false;
        Map<Character, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            char ch = pattern.charAt(i);
            String c = word[i];
            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }
            if (!map1.containsKey(c)) {
                map1.put(c, i);
            }
            if (!map.get(ch).equals(map1.get(c)))
                return false;
        }
        return true;
    }
}
