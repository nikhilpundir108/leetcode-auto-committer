/*
 * Problem: Binary Digit Score (LeetCode #4092)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 41.9 MB (Beats 85.27%)
 * Solved At: 2026-11-27 24:12:36 IST
 * Link: https://leetcode.com/problems/binary-digit-score/
 */

class Solution {
    public int calculateScore(int a, int b) {
        int countA = Integer.bitCount(a);
        int countB = Integer.bitCount(b);

        return countA >= countB ? countA * countB : countB / countA;
    }
}