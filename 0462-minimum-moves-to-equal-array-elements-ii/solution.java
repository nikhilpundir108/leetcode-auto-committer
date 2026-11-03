/*
 * Problem: Minimum Moves to Equal Array Elements II (LeetCode #462)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 9 ms (Beats 87.76%)
 * Memory: 46.6 MB (Beats 55.69%)
 * Solved At: 2026-11-03 19:02:12 IST
 * Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 */

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            ans += Math.abs(nums[end] - nums[start]);
            start++;
            end--;
        }

        return ans;
    }
}