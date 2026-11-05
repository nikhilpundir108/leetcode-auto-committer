/*
 * Problem: Set Mismatch (LeetCode #645)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 95.88%)
 * Memory: 47.3 MB (Beats 71.48%)
 * Solved At: 2026-11-05 20:49:27 IST
 * Link: https://leetcode.com/problems/set-mismatch/
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int x : nums){
            freq[x]++;
        }

        int dup = 0, miss = 0;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2)
                dup = i;
            if (freq[i] == 0)
                miss = i;
        }

        return new int[] { dup, miss };
    }
}