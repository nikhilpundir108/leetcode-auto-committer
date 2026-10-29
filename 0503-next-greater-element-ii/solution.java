/*
 * Problem: Next Greater Element II (LeetCode #503)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 178 ms (Beats 6.44%)
 * Memory: 46.9 MB (Beats 99.10%)
 * Solved At: 2026-10-29 13:54:00 IST
 * Link: https://leetcode.com/problems/next-greater-element-ii/
 */

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int k = 0; k < n; k++) {
            ans[k] = -1;
            int i = (k + 1) % n;

            while (i != k) {
                if (nums[i] > nums[k]) {
                    ans[k] = nums[i];
                    break;
                }

                i = (i + 1) % n;
            }
        }

        return ans;
    }
}