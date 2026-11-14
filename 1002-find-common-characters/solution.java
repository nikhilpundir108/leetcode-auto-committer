/*
 * Problem: Find Common Characters (LeetCode #1002)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 10 ms (Beats 20.61%)
 * Memory: 46.6 MB (Beats 12.17%)
 * Solved At: 2026-11-15 24:08:27 IST
 * Link: https://leetcode.com/problems/find-common-characters/
 */

class Solution {
    public List<String> commonChars(String[] words) {

        List<String> list = new ArrayList<>();

        String str = words[0];

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            boolean found = true;

            for (int j = 1; j < words.length; j++) {

                String temp = words[j];

                int idx = temp.indexOf(ch);

                if (idx == -1) {
                    found = false;
                    break;
                }

                temp = temp.substring(0, idx) + temp.substring(idx + 1);
                words[j] = temp;
            }

            if (found) {
                list.add(String.valueOf(ch));
            }
        }

        return list;
    }
}