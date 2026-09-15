/*
 * Problem: Find the Difference (LeetCode #389)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.78%)
 * Memory: 43.2 MB (Beats 36.82%)
 * Solved At: 2026-09-15 14:13:04 IST
 * Link: https://leetcode.com/problems/find-the-difference/
 */

class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for (char ch : s.toCharArray()) {
            ans ^= ch;
        }
        for (char ch : t.toCharArray()) {
            ans ^= ch;
        }
        return ans;
    }
}