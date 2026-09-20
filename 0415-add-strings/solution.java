/*
 * Problem: Add Strings (LeetCode #415)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 94.99%)
 * Memory: 44 MB (Beats 43.15%)
 * Solved At: 2026-09-20 21:58:56 IST
 * Link: https://leetcode.com/problems/add-strings/
 */

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}