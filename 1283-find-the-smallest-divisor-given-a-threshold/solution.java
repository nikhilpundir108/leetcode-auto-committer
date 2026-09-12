/*
 * Problem: Find the Smallest Divisor Given a Threshold (LeetCode #1283)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms (Beats 99.41%)
 * Memory: 51.1 MB (Beats 54.57%)
 * Solved At: 2026-04-09 05:37:10
 * Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 */

class Solution {
    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static boolean getoutput(int[] nums, int mid, int threshold) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] + mid - 1) / mid;
        }
        if (count <= threshold) {
            return true;
        }
        return false;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // int output = getoutput(nums, mid, threshold);
            if (getoutput(nums, mid, threshold)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }
}