/*
 * Problem: Single Number III (LeetCode #260)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 5 ms (Beats 36.67%)
 * Memory: 47.8 MB (Beats 76.98%)
 * Solved At: 2026-10-28 13:30:14 IST
 * Link: https://leetcode.com/problems/single-number-iii/
 */

class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        int[] ans = new int[2];
        int i = 0;

        for (int num : set) {
            ans[i++] = num;
        }

        return ans;
    }
}