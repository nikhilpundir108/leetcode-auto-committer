/*
 * Problem: Make Sum Divisible by P (LeetCode #1590)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 34 ms (Beats 11.18%)
 * Memory: 98.7 MB (Beats 72.67%)
 * Solved At: 2026-10-28 12:19:12 IST
 * Link: https://leetcode.com/problems/make-sum-divisible-by-p/
 */

class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int rem = (int) (sum % p);
        if (rem == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        long preSum = 0;
        int minLen = n;
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            int currRem = (int) (preSum % p);
            int target = (currRem - rem + p) % p;
            if (map.containsKey(target)) {
                minLen = Math.min(minLen, i - map.get(target));
            }
            map.put(currRem, i);
        }
        return minLen == n ? -1 : minLen;
    }
}