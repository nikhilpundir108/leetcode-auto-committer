/*
 * Problem: Find All Anagrams in a String (LeetCode #438)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 59 ms (Beats 24.00%)
 * Memory: 48 MB (Beats 10.37%)
 * Solved At: 2026-10-05 12:35:37 IST
 * Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        int n1 = s.length();
        int n2 = p.length();
        int l = 0;
        int count = 0;
        for (int r = 0; r < n1; r++) {
            char ch = s.charAt(r);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            count++;
            if (count > n2) {
                char chl = s.charAt(l);
                map2.put(chl, map2.get(chl) - 1);
                if (map2.get(chl) == 0) {
                    map2.remove(chl);
                }
                l++;
                count--;
            }
            if (count == n2) {
                if (map1.equals(map2)) {
                    list.add(l);
                }
            }
        }
        return list;
    }
}