/*
 * Problem: Rearrange Array by Removing Distinct Values (LeetCode #4065)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 9 ms (Beats 38.77%)
 * Memory: 47.8 MB (Beats 9.02%)
 * Solved At: 2026-09-27 12:48:11 IST
 * Link: https://leetcode.com/problems/rearrange-array-by-removing-distinct-values/
 */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        while (!map.isEmpty()) {
            List<Integer> keys = new ArrayList<>();
            for (int key : map.keySet()) {
                keys.add(key);
            }
            Collections.sort(keys);
            for (int key : keys) {
                ans.add(key);
                if (map.get(key) == 1) {
                    map.remove(key);
                } else {
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}