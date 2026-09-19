/*
 * Problem: Permutation in String (LeetCode #567)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms (Beats 87.01%)
 * Memory: 44 MB (Beats 73.98%)
 * Solved At: 2026-09-19 23:57:10 IST
 * Link: https://leetcode.com/problems/permutation-in-string/
 */

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        int l = 0;
        for (int i = 0; i < l1; i++) {
            a1[s1.charAt(i) - 'a']++;
        }
        for (int r = 0; r < s2.length(); r++) {
            a2[s2.charAt(r) - 'a']++;
            if (r - l + 1 > l1) {
                a2[s2.charAt(l) - 'a']--;
                l++;
            }
            if (r - l + 1 == l1) {
                if (Arrays.equals(a1, a2)) {
                    return true;
                }
            }
        }
        return false;
    }
}