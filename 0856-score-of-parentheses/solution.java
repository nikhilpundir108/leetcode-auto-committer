/*
 * Problem: Score of Parentheses (LeetCode #856)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.6 MB (Beats 66.26%)
 * Solved At: 2026-10-05 23:54:09 IST
 * Link: https://leetcode.com/problems/score-of-parentheses/
 */

class Solution {
    public int scoreOfParentheses(String s) {
        int maxsum = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') {
                    maxsum += (int) Math.pow(2, depth);
                }
            }
        }

        return maxsum;
    }
}