/*
 * Problem: Remove Invalid Parentheses (LeetCode #301)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 688 ms (Beats 5.02%)
 * Memory: 53.3 MB (Beats 5.03%)
 * Solved At: 2026-10-07 14:40:33 IST
 * Link: https://leetcode.com/problems/remove-invalid-parentheses/
 */

class Solution {
    Set<String> ans;
    int max_len;

    void solve(String s, int i, String temp, int open, int close) {
        if (i == s.length() && open == close) {
            ans.add(temp);
            max_len = Math.max(max_len, temp.length());
            return;
        }
        if (i >= s.length()) {
            return;
        }
        if (Character.isLowerCase(s.charAt(i))) {
            solve(s, i + 1, temp + s.charAt(i), open, close);
        }
        if (s.charAt(i) == '(') {
            solve(s, i + 1, temp + s.charAt(i), open + 1, close);
            solve(s, i + 1, temp, open, close);
        }
        if (s.charAt(i) == ')') {
            if (open > close) {
                solve(s, i + 1, temp + s.charAt(i), open, close + 1);
            }
            solve(s, i + 1, temp, open, close);
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        ans = new HashSet<>();
        max_len = Integer.MIN_VALUE;
        solve(s, 0, "", 0, 0);
        List<String> res = new ArrayList<>();
        for (String str : ans) {
            if (str.length() == max_len) {
                res.add(str);
            }
        }
        if (max_len == Integer.MIN_VALUE || ans.size() == 0) {
            res.add(" ");
        }
        return res;
    }
}