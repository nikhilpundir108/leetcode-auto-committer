/*
 * Problem: Nim Game (LeetCode #292)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.2 MB (Beats 17.55%)
 * Solved At: 2026-09-25 10:54:58 IST
 * Link: https://leetcode.com/problems/nim-game/
 */

class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}