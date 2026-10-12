/*
 * Problem: Minimum Window Substring (LeetCode #76)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 2 ms (Beats 99.71%)
 * Memory: 45.4 MB (Beats 81.80%)
 * Solved At: 2026-10-12 11:02:13 IST
 * Link: https://leetcode.com/problems/minimum-window-substring/
 */

class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] freq = new int[128];
        int left = 0;
        int miss = n;
        int start = 0;
        int minlen = Integer.MAX_VALUE;

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }
        for (int r = 0; r < m; r++) {
            char ch = s.charAt(r);
            if (freq[ch] > 0) {
                miss--;
            }
            freq[ch]--;
            while (miss == 0) {
                int len = r - left + 1;
                if (minlen > len) {
                    minlen = len;
                    start = left;
                }
                char leftchar = s.charAt(left);
                freq[leftchar]++;
                if (freq[leftchar] > 0) {
                    miss++;
                }
                left++;
            }
        }
        if (minlen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minlen);
    }
}