/*
 * Problem: Three Fibonacci Sum (LeetCode #101210)
 * Difficulty: Unknown
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 42.4 MB (Beats 75.00%)
 * Solved At: 2026-10-11 08:21:37 IST
 * Link: https://leetcode.com/problems/three-fibonacci-sum/
 */

class Solution {
    public boolean threeFibonacciSum(int n) {
        int f0 = 0;
        int f1 = 1;
        int sum = 1;
        while (true) {
            int f2 = f0 + f1;
            // count++;
            sum = f0 + f1 + f2;
            if (sum == n) {
                return true;
            }
            if (sum > n) {
                break;
            }
            f0 = f1;
            f1 = f2;
        }
        return false;
    }
}