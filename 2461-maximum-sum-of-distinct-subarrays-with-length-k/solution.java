/*
 * Problem: Maximum Sum of Distinct Subarrays With Length K (LeetCode #2461)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 32 ms (Beats 92.61%)
 * Memory: 98.5 MB (Beats 77.58%)
 * Solved At: 2026-09-19 21:23:03 IST
 * Link: https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
 */

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int l = 0;
        long maxsum = 0;
        long sum = 0;
        for (int r = 0; r < n; r++) {
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            set.add(nums[r]);
            sum += nums[r];
            if (r - l + 1 > k) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            if (r - l + 1 == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }
        return maxsum;
    }
}