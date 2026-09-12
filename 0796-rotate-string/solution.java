/*
 * Problem: Rotate String (LeetCode #796)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 63.58%)
 * Memory: 43.3 MB (Beats 82.23%)
 * Solved At: 2026-07-31 06:55:33
 * Link: https://leetcode.com/problems/rotate-string/
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String parent = s + s;

        if (parent.contains(goal)) {
            return true;
        }
        return false;
    }
}