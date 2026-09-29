/*
 * Problem: Find Two Non-overlapping Sub-arrays Each With Target Sum (LeetCode #1477)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms (Beats 99.99%)
 * Memory: 91.3 MB (Beats 27.81%)
 * Solved At: 2026-09-29 11:15:43 IST
 * Link: https://leetcode.com/problems/find-two-non-overlapping-sub-arrays-each-with-target-sum/
 */

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;

        int[] best = new int[n];
        for (int i = 0; i < n; i++) {
            best[i] = Integer.MAX_VALUE;
        }

        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                int len = right - left + 1;

                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[left - 1]);
                }

                minLen = Math.min(minLen, len);
            }

            best[right] = minLen;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}