/*
 * Problem: Reverse Degree of a String (LeetCode #3498)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 43.9 MB (Beats 67.14%)
 * Solved At: 2026-09-20 21:07:18 IST
 * Link: https://leetcode.com/problems/reverse-degree-of-a-string/
 */

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = 'z' - ch + 1;
            sum += val * (i + 1);
        }
        return sum;
    }
}