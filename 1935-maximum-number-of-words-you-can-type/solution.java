/*
 * Problem: Maximum Number of Words You Can Type (LeetCode #1935)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 45.60%)
 * Memory: 43.4 MB (Beats 69.46%)
 * Solved At: 2026-09-12 19:22:28
 * Link: https://leetcode.com/problems/maximum-number-of-words-you-can-type/
 */

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }
        String[] arr = text.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (set.contains(str.charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}