/*
 * Problem: Remove All Adjacent Duplicates In String (LeetCode #1047)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 35 ms (Beats 41.43%)
 * Memory: 47 MB (Beats 72.15%)
 * Solved At: 2026-09-30 13:57:47 IST
 * Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}