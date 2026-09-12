/*
 * Problem: Kids With the Greatest Number of Candies (LeetCode #1431)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 95.60%)
 * Memory: 44 MB (Beats 25.14%)
 * Solved At: 2026-09-11 10:09:13
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}