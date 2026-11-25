/*
 * Problem: Find Smallest Letter Greater Than Target (LeetCode #744)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 45.8 MB (Beats 70.92%)
 * Solved At: 2026-11-25 24:48:24 IST
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        int l = 0;
        int h = n - 1;
        char ans = letters[0];

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}