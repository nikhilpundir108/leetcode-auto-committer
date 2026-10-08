/*
 * Problem: Remove Outermost Parentheses (LeetCode #1021)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 64.59%)
 * Memory: 43.2 MB (Beats 96.26%)
 * Solved At: 2026-10-08 10:55:15 IST
 * Link: https://leetcode.com/problems/remove-outermost-parentheses/
 */

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
                if (count > 1) {
                    sb.append(ch);
                }
            } else {
                count--;
                if (count > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}