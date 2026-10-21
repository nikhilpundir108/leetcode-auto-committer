/*
 * Problem: String to Integer (atoi) (LeetCode #8)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 14.81%)
 * Memory: 43.4 MB (Beats 89.62%)
 * Solved At: 2026-10-21 22:20:43 IST
 * Link: https://leetcode.com/problems/string-to-integer-atoi/
 */

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        
        if (n == 0) {
            return 0;
        }

        int i = 0;
        Boolean sign = true;
        if (s.charAt(i) == '-') {
            sign = false;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        long num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
            if (sign && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (!sign && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        if (!sign) {
            num = -num;
        }
        return (int) num;
    }
}