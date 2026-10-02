/*
 * Problem: Generate Parentheses (LeetCode #22)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 68.84%)
 * Memory: 45 MB (Beats 21.06%)
 * Solved At: 2026-10-02 13:17:01 IST
 * Link: https://leetcode.com/problems/generate-parentheses/
 */

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate("", 0, 0, n, list);
        return list;
    }

    public void generate(String temp, int open, int close, int n, List<String> list) {
        if (open == n && close == n) {
            list.add(temp);
            return ;
        }
        if (open < n) {
            generate(temp + '(', open + 1, close, n, list);
        }
        if (close < open) {
            generate(temp + ')', open, close + 1, n, list);
        }
    }
}