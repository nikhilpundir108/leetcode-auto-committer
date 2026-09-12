/*
 * Problem: Longest Consecutive Sequence (LeetCode #128)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 29 ms (Beats 78.37%)
 * Memory: 95.7 MB (Beats 27.17%)
 * Solved At: 2026-08-05 18:10:30
 * Link: https://leetcode.com/problems/longest-consecutive-sequence/
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count;
        int curr;
        int maxCount = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                count = 1;
                curr = num;
                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}