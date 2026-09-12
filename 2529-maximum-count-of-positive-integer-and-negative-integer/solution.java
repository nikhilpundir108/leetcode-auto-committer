/*
 * Problem: Maximum Count of Positive Integer and Negative Integer (LeetCode #2529)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 47 MB (Beats 58.14%)
 * Solved At: 2026-09-08 05:39:37
 * Link: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
 */

class Solution {
    public int maximumCount(int[] nums) {

        int neg = lowerBound(nums, 0);
        int pos = nums.length - lowerBound(nums, 1);
        return neg > pos ? neg : pos;
    }

    public int lowerBound(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}