/*
 * Problem: Sort Array By Parity (LeetCode #905)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 47.1 MB (Beats 15.07%)
 * Solved At: 2026-09-11 05:59:35
 * Link: https://leetcode.com/problems/sort-array-by-parity/
 */

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (nums[l] % 2 == 0) {
                l++;
            } else if (nums[r] % 2 != 0) {
                r--;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        return nums;
    }
}