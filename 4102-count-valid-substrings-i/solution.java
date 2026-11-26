/*
 * Problem: Count Valid Substrings I (LeetCode #4102)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 12 ms (Beats 96.83%)
 * Memory: 47.2 MB (Beats 90.15%)
 * Solved At: 2026-11-26 12:41:44 IST
 * Link: https://leetcode.com/problems/count-valid-substrings-i/
 */

class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        int l = 0;
        long count = 0;

        for (int r = 0; r < n; r++) {

            if (r >= 2 &&
                    s.charAt(r - 2) == 'a' &&
                    s.charAt(r - 1) == 'b' &&
                    s.charAt(r) == 'c') {

                l = r - 1;
            }

            count += r - l + 1;
        }

        return count;
    }
}