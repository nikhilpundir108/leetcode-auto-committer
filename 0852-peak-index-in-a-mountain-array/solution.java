/*
 * Problem: Peak Index in a Mountain Array (LeetCode #852)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 80.2 MB (Beats 57.53%)
 * Solved At: 2026-03-25 15:51:34
 * Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return low;
    }
}