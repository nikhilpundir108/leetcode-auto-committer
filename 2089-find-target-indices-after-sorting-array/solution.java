/*
 * Problem: Find Target Indices After Sorting Array (LeetCode #2089)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 82.77%)
 * Memory: 44 MB (Beats 99.77%)
 * Solved At: 2026-10-19 13:12:17 IST
 * Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int find = 0;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                find++;
            }
            if (nums[i] < target) {
                idx++;
            }
        }
        if (find == 0) {
            return list;
        }
        for (int i = 0; i < find; i++) {
            list.add(idx++);
        }
        return list;
    }
}