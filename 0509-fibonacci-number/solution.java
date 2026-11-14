/*
 * Problem: Fibonacci Number (LeetCode #509)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 10 ms (Beats 25.96%)
 * Memory: 41.8 MB (Beats 56.87%)
 * Solved At: 2026-11-11 11:56:51 IST
 * Link: https://leetcode.com/problems/fibonacci-number/
 */

class Solution {
    int sum=0;
    public int solve(int n){
        if(n==0 || n==1){
            return n;
        }
        return solve(n-1)+solve(n-2);
    }
    public int fib(int n) {
       return solve(n);
    }
}