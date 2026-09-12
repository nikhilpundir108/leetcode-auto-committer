/*
 * Problem: Remove Duplicates from Sorted Array II (LeetCode #80)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 48.8 MB (Beats 51.18%)
 * Solved At: 2026-09-03 06:09:21
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
                c = 1;
            } else {
                c++;
                if (c <= 2) {
                    nums[k] = nums[i];
                    k++;
                }
            }
        }
        return k;
    }
}