/*
 * Problem: Ransom Note (LeetCode #383)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 16 ms (Beats 19.28%)
 * Memory: 47.3 MB (Beats 7.35%)
 * Solved At: 2026-09-11 05:27:16
 * Link: https://leetcode.com/problems/ransom-note/
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            } else {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    map.remove(ch);
                }
            }
        }
        return true;
    }
}