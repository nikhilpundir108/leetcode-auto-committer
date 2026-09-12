/*
 * Problem: Two Furthest Houses With Different Colors (LeetCode #2078)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.5 MB (Beats 22.89%)
 * Solved At: 2026-09-08 10:48:34
 * Link: https://leetcode.com/problems/two-furthest-houses-with-different-colors/
 */

class Solution {
    public int left(int[] nums) {
        int max = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] != nums[r]) {
                max = Math.max(max, r - l);
            }
            r--;
        }
        return max;
    }

    public int right(int[] nums) {
        int max = 0;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            if (nums[l] != nums[r]) {
                max = Math.max(max, r - l);
            }
            l++;
        }
        return max;
    }

    public int maxDistance(int[] colors) {

        return left(colors) > right(colors) ? left(colors) : right(colors);
    }
}