/*
 * Problem: Maximize Sum of Squares of Digits (LeetCode #3723)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 124 ms (Beats 39.77%)
 * Memory: 47.7 MB (Beats 88.64%)
 * Solved At: 2026-10-14 10:16:21 IST
 * Link: https://leetcode.com/problems/maximize-sum-of-squares-of-digits/
 */

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (sum >= 9) {
            sb.append(9);
            sum -= 9;
        }
        if (sum > 0) {
            sb.append(sum);
        }
        while (sb.length() < num) {
            sb.append(0);
        }
        return sb.toString();
    }
}