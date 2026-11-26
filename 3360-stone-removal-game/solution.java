/*
 * Problem: Stone Removal Game (LeetCode #3360)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 41.4 MB (Beats 93.40%)
 * Solved At: 2026-11-26 12:17:41 IST
 * Link: https://leetcode.com/problems/stone-removal-game/
 */

class Solution {
    public boolean canAliceWin(int n) {
        int start = 10;
        boolean aliceTurn = true;

        while (n >= start) {
            n -= start;
            start--;

            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }
}