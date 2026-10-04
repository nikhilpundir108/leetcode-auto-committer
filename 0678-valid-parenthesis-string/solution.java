/*
 * Problem: Valid Parenthesis String (LeetCode #678)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43 MB (Beats 19.71%)
 * Solved At: 2026-10-04 16:19:06 IST
 * Link: https://leetcode.com/problems/valid-parenthesis-string/
 */

class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                min++;
                max++;
            } else if (ch == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }
            if (max < 0) {
                return false;
            }
            if (min < 0) {
                min = 0;
            }
        }
        return min == 0;
    }
}