/*
 * Problem: Split Array Largest Sum (LeetCode #410)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.7 MB (Beats 92.24%)
 * Solved At: 2026-04-09 14:36:04
 * Link: https://leetcode.com/problems/split-array-largest-sum/
 */

class Solution {
    public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static boolean isMinimized(int[] arr, int k, int mid) {
        int splitArr = 1;
        int integer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;
            }
            if (integer + arr[i] > mid) {
                splitArr += 1;
                integer = arr[i];
            } else {
                integer += arr[i];
            }
        }
        return splitArr <= k;
    }

    public int splitArray(int[] nums, int k) {
        int low = min(nums);
        int high = sum(nums);
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isMinimized(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}