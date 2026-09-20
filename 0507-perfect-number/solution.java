/*
 * Problem: Perfect Number (LeetCode #507)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 85.16%)
 * Memory: 42.3 MB (Beats 25.80%)
 * Solved At: 2026-09-20 11:02:28 IST
 * Link: https://leetcode.com/problems/perfect-number/
 */

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}