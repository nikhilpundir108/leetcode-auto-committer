/*
 * Problem: Find All Anagrams in a String (LeetCode #438)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 63 ms (Beats 21.04%)
 * Memory: 48.1 MB (Beats 8.43%)
 * Solved At: 2026-10-07 15:43:57 IST
 * Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapP = new HashMap<>();
        for (char ch : p.toCharArray()) {
            mapP.put(ch, mapP.getOrDefault(ch, 0) + 1);
        }
        int n1 = s.length();
        int n2 = p.length();
        int l = 0;
        int count = 0;
        for (int r = 0; r < n1; r++) {
            char ch = s.charAt(r);
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
            count++;
            if (count > n2) {
                mapS.put(s.charAt(l), mapS.get(s.charAt(l)) - 1);
                if (mapS.get(s.charAt(l)) == 0) {
                    mapS.remove(s.charAt(l));
                }
                l++;
                count--;
            }
            if (count == n2) {
                if (mapS.equals(mapP)) {
                    list.add(l);
                }
            }
        }
        return list;
    }
}