/*
 * Problem: Add Binary (LeetCode #67)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.97%)
 * Memory: 43.6 MB (Beats 53.40%)
 * Solved At: 2026-10-06 22:42:54 IST
 * Link: https://leetcode.com/problems/add-binary/
 */

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}