/*
 * Problem: Median of Two Sorted Arrays (LeetCode #4)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 7 ms (Beats 23.45%)
 * Memory: 48.7 MB (Beats 86.20%)
 * Solved At: 2025-11-03 14:29:22
 * Link: https://leetcode.com/problems/median-of-two-sorted-arrays/
 */

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        int[] merged = new int[m + n];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            merged[m+i] = nums2[i];
        }
        Arrays.sort(merged);

        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[(total/2-1)]+merged[total/2])/2.0;

        }
    }
}