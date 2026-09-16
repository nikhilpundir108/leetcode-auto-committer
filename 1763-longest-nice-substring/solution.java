/*
 * Problem: Longest Nice Substring (LeetCode #1763)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 26 ms (Beats 25.88%)
 * Memory: 46.5 MB (Beats 27.31%)
 * Solved At: 2026-09-16 16:10:03 IST
 * Link: https://leetcode.com/problems/longest-nice-substring/
 */

class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                set.add(ch);
                boolean nice = true;
                for (char c : set) {
                    if (Character.isLowerCase(c)) {
                        if (!set.contains(Character.toUpperCase(c))) {
                            nice = false;
                            break;
                        }
                    } else {
                        if (!set.contains(Character.toLowerCase(c))) {
                            nice = false;
                            break;
                        }
                    }
                }
                if (nice && j - i + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }
}