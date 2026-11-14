/*
 * Problem: Minimum Positive Sum Subarray  (LeetCode #3364)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms (Beats 37.76%)
 * Memory: 46 MB (Beats 73.67%)
 * Solved At: 2026-11-14 16:24:11 IST
 * Link: https://leetcode.com/problems/minimum-positive-sum-subarray/
 */

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n && j - i + 1 <= r; j++) {

                sum += nums.get(j);

                int len = j - i + 1;

                if (len >= l && sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}