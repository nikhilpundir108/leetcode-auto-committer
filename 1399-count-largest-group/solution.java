/*
 * Problem: Count Largest Group (LeetCode #1399)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 8 ms (Beats 54.15%)
 * Memory: 43.2 MB (Beats 10.70%)
 * Solved At: 2026-09-12 21:37:54
 * Link: https://leetcode.com/problems/count-largest-group/
 */

class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int max = 0;
        for (int value : map.values()) {
            max = Math.max(max, value);
        }
        int res = 0;
        for (int value : map.values()) {
            if (max == value) {
                res++;
            }
        }
        return res;
    }
}