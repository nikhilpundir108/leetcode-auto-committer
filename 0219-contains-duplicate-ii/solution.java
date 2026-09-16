/*
 * Problem: Contains Duplicate II (LeetCode #219)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 32 ms (Beats 29.76%)
 * Memory: 104.6 MB (Beats 75.12%)
 * Solved At: 2026-09-16 15:33:32 IST
 * Link: https://leetcode.com/problems/contains-duplicate-ii/
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (i - left >= k) {
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}