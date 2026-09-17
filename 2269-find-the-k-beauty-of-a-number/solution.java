/*
 * Problem: Find the K-Beauty of a Number (LeetCode #2269)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 91.48%)
 * Memory: 42.2 MB (Beats 74.57%)
 * Solved At: 2026-09-17 15:17:35 IST
 * Link: https://leetcode.com/problems/find-the-k-beauty-of-a-number/
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int ans = 0;
        for (int i = 0; i <= str.length() - k; i++) {
            int x = Integer.parseInt(str.substring(i, i + k));
            if (x != 0 && num % x == 0) {
                ans++;
            }
        }
        return ans;
    }
}