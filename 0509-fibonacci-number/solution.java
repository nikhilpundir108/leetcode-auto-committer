/*
 * Problem: Fibonacci Number (LeetCode #509)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 10 ms (Beats 25.67%)
 * Memory: 41.7 MB (Beats 96.50%)
 * Solved At: 2026-09-25 16:15:32 IST
 * Link: https://leetcode.com/problems/fibonacci-number/
 */

class Solution {
    public int sum(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return sum(n - 1) + sum(n - 2);
    }

    public int fib(int n) {
        return sum(n);

    }
}