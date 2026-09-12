/*
 * Problem: Minimum Sum of Four Digit Number After Splitting Digits (LeetCode #2160)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 90.90%)
 * Memory: 42.5 MB (Beats 17.78%)
 * Solved At: 2026-09-09 05:39:12
 * Link: https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
 */

class Solution {
    public int minimumSum(int num) {
        int[] res = new int[4];
        int i = 0;
        while (num > 0) {
            int k = num % 10;
            res[i++] = k;
            num = num / 10;
        }
        Arrays.sort(res);
        return (res[0] * 10 + res[3]) + (res[1] * 10 + res[2]);
    }
}