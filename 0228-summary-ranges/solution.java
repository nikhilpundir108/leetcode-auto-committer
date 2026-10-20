/*
 * Problem: Summary Ranges (LeetCode #228)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 78.45%)
 * Memory: 42.6 MB (Beats 96.58%)
 * Solved At: 2026-10-20 15:16:34 IST
 * Link: https://leetcode.com/problems/summary-ranges/
 */


import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int start = nums[i];

            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (start == nums[i]) {
                list.add(String.valueOf(start));
            } else {
                list.add(start + "->" + nums[i]);
            }

            i++;
        }

        return list;
    }
}
