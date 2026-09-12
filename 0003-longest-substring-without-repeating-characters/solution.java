/*
 * Problem: Longest Substring Without Repeating Characters (LeetCode #3)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 65 ms (Beats 40.59%)
 * Memory: 47.7 MB (Beats 64.70%)
 * Solved At: 2026-08-24 16:11:39
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int m = right - left + 1;
            max = Math.max(max, m);
        }
        return max;
    }
}