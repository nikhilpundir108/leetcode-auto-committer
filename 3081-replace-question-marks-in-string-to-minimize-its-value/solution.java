/*
 * Problem: Replace Question Marks in String to Minimize Its Value (LeetCode #3081)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 40 ms (Beats 85.42%)
 * Memory: 48.4 MB (Beats 47.92%)
 * Solved At: 2026-10-06 14:45:21 IST
 * Link: https://leetcode.com/problems/replace-question-marks-in-string-to-minimize-its-value/
 */

class Solution {
    public String minimizeStringValue(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch != '?') {
                freq[ch - 'a']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '?') {
                int min = 0;
                for (int i = 1; i < 26; i++) {
                    if (freq[i] < freq[min]) {
                        min = i;
                    }
                }
                sb.append((char) ('a' + min));
                freq[min]++;
            }
        }
        char[] replace = sb.toString().toCharArray();
        Arrays.sort(replace);
        StringBuilder ans = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '?') {
                ans.append(replace[j++]);
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}