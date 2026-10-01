/*
 * Problem: Keyboard Row (LeetCode #500)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 34.41%)
 * Memory: 42.9 MB (Beats 51.59%)
 * Solved At: 2026-09-30 23:42:32 IST
 * Link: https://leetcode.com/problems/keyboard-row/
 */

class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (char ch : "qwertyuiop".toCharArray()) {
            map.put(ch, 1);
        }
        for (char ch : "asdfghjkl".toCharArray()) {
            map.put(ch, 2);
        }
        for (char ch : "zxcvbnm".toCharArray()) {
            map.put(ch, 3);
        }
        for (String word : words) {
            String ch = word.toLowerCase();
            int row = map.get(ch.charAt(0));
            boolean valid = true;
            for (int j = 1; j < ch.length(); j++) {
                if (map.get(ch.charAt(j)) != row) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}