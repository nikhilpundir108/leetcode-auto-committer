/*
 * Problem: Majority Element (LeetCode #169)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 15 ms (Beats 23.85%)
 * Memory: 52.4 MB (Beats 94.97%)
 * Solved At: 2026-09-02 10:56:51
 * Link: https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int e : map.keySet()) {
            if (map.get(e) > n / 2) {
                return e;
            }
        }
        return -1;
    }
}