/*
 * Problem: Destination City (LeetCode #1436)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 99.69%)
 * Memory: 44.9 MB (Beats 62.12%)
 * Solved At: 2026-09-11 06:24:42
 * Link: https://leetcode.com/problems/destination-city/
 */

class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            set.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            if (!set.contains(paths.get(i).get(1))) {
                return paths.get(i).get(1);
            }
        }
        return " ";
    }
}