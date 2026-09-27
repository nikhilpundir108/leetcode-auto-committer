/*
 * Problem: Minimum Queen Moves to Reach Target (LeetCode #4061)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 44.2 MB
 * Solved At: 2026-09-27 13:03:34 IST
 * Link: https://leetcode.com/problems/minimum-queen-moves-to-reach-target/
 */

class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int sr = source[0];
        int sc = source[1];
        int tr = target[0];
        int tc = target[1];
        if (sr == tr && sc == tc) {
            return 0;
        } else if (sr == tr) {
            return 1;
        } else if (sc == tc) {
            return 1;
        } else if (Math.abs(sr - tr) == Math.abs(sc - tc)) {
            return 1;
        }
        return 2;
    }
}