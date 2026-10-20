/*
 * Problem: Assign Cookies (LeetCode #455)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 17 ms (Beats 10.45%)
 * Memory: 51 MB (Beats 92.29%)
 * Solved At: 2026-10-20 15:44:20 IST
 * Link: https://leetcode.com/problems/assign-cookies/
 */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}