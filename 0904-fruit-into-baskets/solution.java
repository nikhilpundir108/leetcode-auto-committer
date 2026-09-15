/*
 * Problem: Fruit Into Baskets (LeetCode #904)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 54 ms (Beats 64.35%)
 * Memory: 68.7 MB (Beats 83.22%)
 * Solved At: 2026-09-15 10:47:34 IST
 * Link: https://leetcode.com/problems/fruit-into-baskets/
 */

class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            if (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++;

            }
            max = Math.max(max, i - l + 1);
        }
        return max;
    }
}
