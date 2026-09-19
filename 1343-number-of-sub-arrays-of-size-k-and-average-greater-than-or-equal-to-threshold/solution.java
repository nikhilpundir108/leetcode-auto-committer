/*
 * Problem: Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold (LeetCode #1343)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 87.71%)
 * Memory: 71.7 MB (Beats 62.94%)
 * Solved At: 2026-09-19 23:32:57 IST
 * Link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
 */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int count = 0;
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            if (r - l + 1 == k) {
                if (sum / k >= threshold) {
                    count++;
                }
                sum -= arr[l];
                l++;
            }
        }
        return count;
    }
}