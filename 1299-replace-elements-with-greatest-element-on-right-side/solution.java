/*
 * Problem: Replace Elements with Greatest Element on Right Side (LeetCode #1299)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 66.00%)
 * Memory: 48.5 MB (Beats 91.12%)
 * Solved At: 2026-10-29 12:08:28 IST
 * Link: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            arr[i] = max;
            max = Math.max(max, curr);
        }
        return arr;
    }
}