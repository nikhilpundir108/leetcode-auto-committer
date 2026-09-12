/*
 * Problem: Largest Positive Integer That Exists With Its Negative (LeetCode #2441)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 6 ms (Beats 82.86%)
 * Memory: 47.1 MB (Beats 41.54%)
 * Solved At: 2026-09-12 20:25:58
 * Link: https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/
 */

class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = -1;
        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                max = Math.max(max, num);
            }
        }
        return max;
    }
}