/*
 * Problem: Longest Palindrome (LeetCode #409)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.86%)
 * Memory: 42.9 MB (Beats 91.22%)
 * Solved At: 2026-09-18 11:47:46 IST
 * Link: https://leetcode.com/problems/longest-palindrome/
 */

class Solution {
    public int longestPalindrome(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // int count = 0;
        // for (int freq : map.values()) {
        //     if (freq % 2 == 0) {
        //         count += freq;
        //     } else {
        //         count += freq - 1;
        //     }
        // }
        // return count == s.length() ? count : count + 1;
        int freq[] = new int[128];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        int length = 0;
        boolean odd = false;
        for (int count : freq) {
            length += (count / 2) * 2;
            if (count % 2 == 1) {
                odd = true;
            }
        }
        if (odd) {
            length++;
        }
        return length;
    }
}