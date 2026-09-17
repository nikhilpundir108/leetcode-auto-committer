/*
 * Problem: Sign of the Product of an Array (LeetCode #1822)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.9 MB (Beats 96.83%)
 * Solved At: 2026-09-17 10:54:51 IST
 * Link: https://leetcode.com/problems/sign-of-the-product-of-an-array/
 */

class Solution {
    public int arraySign(int[] nums) {
        long neg = 0;
        for (long num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                neg++;
            }
        }
        return neg % 2 != 0 ? -1 : 1;
    }
}