/*
 * Problem: Minimum Insertions to Balance a Parentheses String (LeetCode #1541)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 8 ms (Beats 99.37%)
 * Memory: 47.6 MB (Beats 59.14%)
 * Solved At: 2026-10-09 12:29:52 IST
 * Link: https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
 */

class Solution {
    public int minInsertions(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int open = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == '(') {
                open++;
            } else {
                if ((i + 1) < n && ch[i + 1] == ')') {
                    i++;
                } else {
                    ans++;
                }
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }
        return ans + (open * 2);
    }
}