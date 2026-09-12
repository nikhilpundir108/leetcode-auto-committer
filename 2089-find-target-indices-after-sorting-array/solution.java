/*
 * Problem: Find Target Indices After Sorting Array (LeetCode #2089)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 5 ms (Beats 73.61%)
 * Memory: 47.1 MB (Beats 29.96%)
 * Solved At: 2026-09-10 05:33:49
 * Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}