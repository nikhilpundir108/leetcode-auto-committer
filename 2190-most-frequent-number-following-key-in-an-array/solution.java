/*
 * Problem: Most Frequent Number Following Key In an Array (LeetCode #2190)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 65.34%)
 * Memory: 46.3 MB (Beats 59.53%)
 * Solved At: 2026-09-12 21:09:13
 * Link: https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
 */

class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                map.put(target, map.getOrDefault(target, 0) + 1);

            }
        }
        int max = 0;
        int maxCount = 0;
        for (int target : map.keySet()) {
            int count = map.get(target);
            if (count > maxCount) {
                max = target;
                maxCount = count;
            }
        }
        return max;
    }
}