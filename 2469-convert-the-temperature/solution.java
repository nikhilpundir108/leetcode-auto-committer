/*
 * Problem: Convert the Temperature (LeetCode #2469)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 45.4 MB (Beats 99.53%)
 * Solved At: 2026-09-07 10:39:30
 * Link: https://leetcode.com/problems/convert-the-temperature/
 */

class Solution {
    public double[] convertTemperature(double c) {
        return new double[] { c + 273.15, c * 1.80 + 32.00 };

    }
}