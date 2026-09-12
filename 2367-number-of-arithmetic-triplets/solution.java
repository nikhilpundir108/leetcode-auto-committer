/*
 * Problem: Number of Arithmetic Triplets (LeetCode #2367)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 92.81%)
 * Memory: 43.4 MB (Beats 31.24%)
 * Solved At: 2026-09-12 20:04:30
 * Link: https://leetcode.com/problems/number-of-arithmetic-triplets/
 */

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i] - diff) && set.contains(nums[i] + diff)) {
                count++;
            }
        }
        return count;
    }
}