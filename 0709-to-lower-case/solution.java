/*
 * Problem: To Lower Case (LeetCode #709)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 26.42%)
 * Memory: 43.1 MB (Beats 34.75%)
 * Solved At: 2026-09-18 10:39:57 IST
 * Link: https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}