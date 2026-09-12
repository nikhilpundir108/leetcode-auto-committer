/*
 * Problem: Pow(x, n) (LeetCode #50)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 47.7 MB (Beats 70.30%)
 * Solved At: 2026-03-13 06:05:56
 * Link: https://leetcode.com/problems/powx-n/
 */

class Solution {
    public double myPow(double x, int n) {
        double res = 1;
        long pow = n;

        if (pow < 0) {
            x = 1 / x;
            pow = -pow;
        }

         while(pow > 0){
            if(pow % 2 == 1){
                res = res * x;
            }

            x = x * x;
            pow = pow / 2;
        }
        return res;
    }
}