/*
 * Problem: Split With Minimum Sum (LeetCode #2578)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 38.52%)
 * Memory: 42.2 MB (Beats 56.89%)
 * Solved At: 2026-09-09 06:20:06
 * Link: https://leetcode.com/problems/split-with-minimum-sum/
 */

class Solution {
    public int splitNum(int num) {
        int res[] = new int[length(num)];
        int i = 0;
        while (num > 0) {
            int k = num % 10;
            res[i++] = k;
            num = num / 10;
        }
        Arrays.sort(res);
        int even = 0;
        int odd = 0;
        for (int j = 0; j < res.length; j = j + 2) {
            even = even * 10 + res[j];
        }
        for (int j = 1; j < res.length; j = j + 2) {
            odd = odd * 10 + res[j];
        }
        return even + odd;
    }

    public int length(int num) {
        int count = 0;
        while (num > 0) {
            int k = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
}