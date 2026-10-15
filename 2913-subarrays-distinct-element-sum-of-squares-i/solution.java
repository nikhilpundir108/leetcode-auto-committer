/*
 * Problem: Subarrays Distinct Element Sum of Squares I (LeetCode #2913)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms (Beats 88.59%)
 * Memory: 44.8 MB (Beats 99.24%)
 * Solved At: 2026-10-15 14:54:17 IST
 * Link: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
 */

class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[101];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                int num = nums.get(j);

                if (!seen[num]) {
                    seen[num] = true;
                    distinct++;
                }

                answer += distinct * distinct;
            }
        }

        return answer;
    }
}