/*
 * Problem: Reverse Substrings Between Each Pair of Parentheses (LeetCode #1190)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 66.67%)
 * Memory: 42.7 MB (Beats 97.78%)
 * Solved At: 2026-09-27 12:14:15 IST
 * Link: https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
 */

class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            if (ch[i] == '(') {
                stack.push(i);
            } else if (ch[i] == ')') {
                int l = stack.pop() + 1;
                int r = i - 1;
                while (l < r) {
                    char temp = ch[l];
                    ch[l] = ch[r];
                    ch[r] = temp;
                    l++;
                    r--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (ch[i] != '(' && ch[i] != ')') {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}