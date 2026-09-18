/*
 * Problem: Jewels and Stones (LeetCode #771)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.9 MB (Beats 83.57%)
 * Solved At: 2026-09-18 10:53:13 IST
 * Link: https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] res = new boolean[128];
        for (char ch : jewels.toCharArray()) {
            res[ch] = true;
        }
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (res[ch]) {
                count++;
            }
        }
        return count;
    }
}