/*
 * Problem: Capacity To Ship Packages Within D Days (LeetCode #1011)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 14 ms (Beats 10.31%)
 * Memory: 49.9 MB (Beats 87.75%)
 * Solved At: 2026-04-09 07:04:43
 * Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
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

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static boolean getDays(int[] nums, int mid, int days) {
        int load = 0;
        int day = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + load <= mid) {
                load += nums[i];
            } else {
                day++;
                load = nums[i];
            }
        }
        return day <= days ;

    }

    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (getDays(weights,mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}