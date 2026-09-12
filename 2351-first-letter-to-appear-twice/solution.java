/*
 * Problem: First Letter to Appear Twice (LeetCode #2351)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43 MB (Beats 17.31%)
 * Solved At: 2026-09-12 20:11:16
 * Link: https://leetcode.com/problems/first-letter-to-appear-twice/
 */

class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return ' ';
    }
}