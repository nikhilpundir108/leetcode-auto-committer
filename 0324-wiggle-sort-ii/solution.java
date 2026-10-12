/*
 * Problem: Wiggle Sort II (LeetCode #324)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 8 ms (Beats 95.88%)
 * Memory: 48.9 MB (Beats 58.03%)
 * Solved At: 2026-10-12 15:54:25 IST
 * Link: https://leetcode.com/problems/wiggle-sort-ii/
 */

class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int mid = (int) Math.ceil(nums.length / 2.0);
        int l = mid - 1;
        int r = nums.length - 1;
        int i = 0;
        while (l >= 0 && r >= mid) {
            ans[i++] = nums[l--];
            ans[i++] = nums[r--];
        }
        while (l >= 0) {
            ans[i++] = nums[l--];
        }
        while (r >= mid) {
            ans[i++] = nums[r--];
        }
        for (int j = 0; j < nums.length; j++) {
            nums[j] = ans[j];
        }

    }
}