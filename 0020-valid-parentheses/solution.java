/*
 * Problem: Valid Parentheses (LeetCode #20)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 85.88%)
 * Memory: 43.2 MB (Beats 72.17%)
 * Solved At: 2026-10-01 11:55:29 IST
 * Link: https://leetcode.com/problems/valid-parentheses/
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}