/*
 * Problem: Third Maximum Number (LeetCode #414)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 8 ms (Beats 14.05%)
 * Memory: 46.8 MB (Beats 5.48%)
 * Solved At: 2026-09-10 06:45:57
 * Link: https://leetcode.com/problems/third-maximum-number/
 */

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < 3) {
            for (int n : set) {
                return n;
            }
        }
        int res = 0;
        int k = 0;
        for (int n : set) {
            k++;
            res = n;
            if (k == 3) {
                return res;
            }
        }
        return res;
    }
}