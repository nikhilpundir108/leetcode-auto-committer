/*
 * Problem: Max Consecutive Ones III (LeetCode #1004)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 95.85%)
 * Memory: 52.4 MB (Beats 6.43%)
 * Solved At: 2026-09-18 14:28:28 IST
 * Link: https://leetcode.com/problems/max-consecutive-ones-iii/
 */

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int count = 0;
        int ans = 0;
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                count++;
            }
            while (count > k) {
                if (nums[l] == 0) {
                    count--;
                }
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}