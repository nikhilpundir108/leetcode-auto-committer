/*
 * Problem: Longest Valid Parentheses (LeetCode #32)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 5 ms (Beats 74.93%)
 * Memory: 46.6 MB (Beats 40.83%)
 * Solved At: 2026-09-30 10:35:47 IST
 * Link: https://leetcode.com/problems/longest-valid-parentheses/
 */

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    ans = Math.max(ans, i - st.peek());
                }
            }
        }
        return ans;
    }
}