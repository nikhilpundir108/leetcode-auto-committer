/*
 * Problem: Rotate String (LeetCode #796)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 71.51%)
 * Memory: 43 MB (Beats 81.61%)
 * Solved At: 2026-11-10 15:37:42 IST
 * Link: https://leetcode.com/problems/rotate-string/
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}