/*
 * Problem: Count Items Matching a Rule (LeetCode #1773)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms (Beats 96.61%)
 * Memory: 49.9 MB (Beats 13.02%)
 * Solved At: 2026-09-10 04:53:11
 * Link: https://leetcode.com/problems/count-items-matching-a-rule/
 */

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = 0;
        if (ruleKey.equals("color")) {
            idx = 1;
        } else if (ruleKey.equals("name")) {
            idx = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            if (item.get(idx).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}