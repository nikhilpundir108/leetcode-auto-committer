/*
 * Problem: Isomorphic Strings (LeetCode #205)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 17 ms (Beats 41.75%)
 * Memory: 44 MB (Beats 41.91%)
 * Solved At: 2026-07-31 22:29:35
 * Link: https://leetcode.com/problems/isomorphic-strings/
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (mapS.containsKey(a)) {
                if (mapS.get(a) != b) {
                    return false;
                }
            } else {
                mapS.put(a, b);
            }

            if (mapT.containsKey(b)) {
                if (mapT.get(b) != a) {
                    return false;
                }
            } else {
                mapT.put(b, a);
            }
        }
        return true;

    }
}