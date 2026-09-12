/*
 * Problem: Jewels and Stones (LeetCode #771)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 57.90%)
 * Memory: 43.3 MB (Beats 35.80%)
 * Solved At: 2026-09-11 04:38:52
 * Link: https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}