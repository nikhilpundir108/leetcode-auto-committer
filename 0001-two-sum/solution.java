/*
 * Problem: Two Sum (LeetCode #1)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 47.1 MB (Beats 41.10%)
 * Solved At: 2026-09-07 10:12:52
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (left <= right) {
            if (map.containsKey(target - nums[left])) {
                return new int[] { left, map.get(target - nums[left]) };
            }
            map.put(nums[left], left);
            if (map.containsKey(target - nums[right])) {
                return new int[] { right, map.get(target - nums[right]) };
            }
            map.put(nums[right], right);
            left++;
            right--;
        }
        return new int[] { -1, -1 };
    }
}