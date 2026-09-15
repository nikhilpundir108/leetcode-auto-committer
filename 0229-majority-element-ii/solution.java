/*
 * Problem: Majority Element II (LeetCode #229)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 14 ms (Beats 43.79%)
 * Memory: 53 MB (Beats 17.20%)
 * Solved At: 2026-09-15 15:36:07 IST
 * Link: https://leetcode.com/problems/majority-element-ii/
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                list.add(key);
            }
        }
        return list;
    }
}