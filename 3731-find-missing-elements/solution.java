/*
 * Problem: Find Missing Elements (LeetCode #3731)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 91.43%)
 * Memory: 46.8 MB (Beats 55.21%)
 * Solved At: 2026-09-19 17:03:32 IST
 * Link: https://leetcode.com/problems/find-missing-elements/
 */

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] res = new int[101];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            res[num] = 1;
        }
        for (int i = min; i <= max; i++) {
            if (res[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}