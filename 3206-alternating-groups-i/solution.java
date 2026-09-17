/*
 * Problem: Alternating Groups I (LeetCode #3206)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 97.33%)
 * Memory: 45 MB (Beats 14.95%)
 * Solved At: 2026-09-17 16:04:59 IST
 * Link: https://leetcode.com/problems/alternating-groups-i/
 */

class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;
        for (int i = 0; i < colors.length; i++) {
            if (i == 0 && colors[n - 1] == colors[1] && colors[1] != colors[0]) {
                count++;
            } else if (i == n - 1 && colors[n - 2] == colors[0] && colors[0] != colors[n - 1]) {
                count++;
            } else if (i != n-1 && i != 0 && colors[i - 1] == colors[i + 1] && colors[i] != colors[i + 1]) {
                count++;
            }
        }
        return count;
    }
}