/*
 * Problem: Check If Digits Are Equal in String After Operations I (LeetCode #3461)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 9 ms (Beats 65.28%)
 * Memory: 46 MB (Beats 59.95%)
 * Solved At: 2026-11-14 24:35:06 IST
 * Link: https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/
 */


class Solution {
    public boolean hasSameDigits(String s) {

        while (s.length() > 2) {

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length() - 1; i++) {

                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';

                int sum = (a + b) % 10;

                sb.append(sum);
            }

            s = sb.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }
}
