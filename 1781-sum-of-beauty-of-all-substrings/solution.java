/*
 * Problem: Sum of Beauty of All Substrings (LeetCode #1781)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 70 ms (Beats 39.59%)
 * Memory: 44.7 MB (Beats 31.06%)
 * Solved At: 2026-10-06 16:21:23 IST
 * Link: https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
 */

class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                        max = Math.max(max, freq[k]);
                    }
                }
                ans += max - min;
            }
        }
        return ans;
    }
}