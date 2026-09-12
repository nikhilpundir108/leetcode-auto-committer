/*
 * Problem: Count Integers With Even Digit Sum (LeetCode #2180)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 84.01%)
 * Memory: 42.2 MB (Beats 21.61%)
 * Solved At: 2026-09-08 08:28:46
 * Link: https://leetcode.com/problems/count-integers-with-even-digit-sum/
 */

class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (sum(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int sum(int no) {
        int sum = 0;
        while (no > 0) {
            int k = no % 10;
            sum += k;
            no = no / 10;
        }
        return sum;
    }
}