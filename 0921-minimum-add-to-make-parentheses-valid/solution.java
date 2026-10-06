/*
 * Problem: Minimum Add to Make Parentheses Valid (LeetCode #921)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 42.17%)
 * Memory: 42.9 MB (Beats 39.71%)
 * Solved At: 2026-10-06 14:06:15 IST
 * Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
 */

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                st.push(ch);
            } 
            else {
                if (!st.isEmpty()) {
                    st.pop();
                } 
                else {
                    ans++;
                }
            }
        }
        ans += st.size();
        return ans;
    }
}