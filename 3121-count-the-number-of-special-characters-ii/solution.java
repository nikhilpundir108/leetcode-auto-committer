/*
 * Problem: Count the Number of Special Characters II (LeetCode #3121)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 9 ms (Beats 86.00%)
 * Memory: 47.4 MB (Beats 98.48%)
 * Solved At: 2026-10-19 15:01:46 IST
 * Link: https://leetcode.com/problems/count-the-number-of-special-characters-ii/
 */

class Solution {
    public int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lower[ch - 'a'] = i;
            } else {
                int idx = ch - 'A';

                if (upper[idx] == -1) {
                    upper[idx] = i;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (lower[i] != -1 &&
                upper[i] != -1 &&
                lower[i] < upper[i]) {
                count++;
            }
        }

        return count;
    }
}