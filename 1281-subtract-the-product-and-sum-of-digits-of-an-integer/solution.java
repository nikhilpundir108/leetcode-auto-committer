/*
 * Problem: Subtract the Product and Sum of Digits of an Integer (LeetCode #1281)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.3 MB (Beats 27.49%)
 * Solved At: 2026-09-07 08:26:36
 * Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */

class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int k = n % 10;
            prod = prod * k;
            sum = sum + k;
            n = n / 10;
        }
        return prod - sum;
    }
}