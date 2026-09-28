/*
 * Problem: Maximum Nesting Depth of the Parentheses (LeetCode #1614)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.9 MB (Beats 51.61%)
 * Solved At: 2026-09-28 20:15:05 IST
 * Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */

class Solution {
    public int maxDepth(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int count = 0;
        int max = 0;
        int i = 0;
        while (i < n) {
            if (a[i] == '(') {
                count++;
                max = Math.max(max, count);
            }
            if (a[i] == ')') {
                count--;
            }
            i++;
        }
        return max;
    }
}