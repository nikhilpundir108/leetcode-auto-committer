/*
 * Problem: Longest Common Prefix (LeetCode #14)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 59.96%)
 * Memory: 43.1 MB (Beats 82.54%)
 * Solved At: 2026-07-31 07:45:22
 * Link: https://leetcode.com/problems/longest-common-prefix/
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}