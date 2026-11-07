/*
 * Problem: Evaluate Reverse Polish Notation (LeetCode #150)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms (Beats 46.62%)
 * Memory: 44.6 MB (Beats 96.73%)
 * Solved At: 2026-11-07 19:17:34 IST
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int a = st.pop();
                int b = st.pop();

                switch (token) {
                    case "+":
                        st.push(a + b);
                        break;
                    case "-":
                        st.push(b - a);
                        break;
                    case "*":
                        st.push(a * b);
                        break;
                    case "/":
                        st.push(b / a);
                        break;
                }
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}