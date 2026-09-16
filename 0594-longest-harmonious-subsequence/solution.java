/*
 * Problem: Longest Harmonious Subsequence (LeetCode #594)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 15 ms (Beats 99.00%)
 * Memory: 48.4 MB (Beats 23.95%)
 * Solved At: 2026-09-16 14:51:24 IST
 * Link: https://leetcode.com/problems/longest-harmonious-subsequence/
 */

class Solution {
    public int findmax(int[] nums, int r) {
        int max = 0;
        for (int i = 0; i < r; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int findmin(int[] nums, int r) {
        int min = 0;
        for (int i = 0; i < r; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);
                max = Math.max(max, length);
            }
        }
        return max;
    }
}