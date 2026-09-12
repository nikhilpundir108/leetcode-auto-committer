/*
 * Problem: Unique Number of Occurrences (LeetCode #1207)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 98.08%)
 * Memory: 43.6 MB (Beats 69.85%)
 * Solved At: 2026-09-11 05:10:09
 * Link: https://leetcode.com/problems/unique-number-of-occurrences/
 */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int freq : map.values()) {
            if (!set.add(freq)) {
                return false;
            }
        }

        return true;
    }
}