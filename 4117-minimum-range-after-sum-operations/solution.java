/*
 * Problem: Minimum Range After Sum Operations (LeetCode #4117)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 100.00%)
 * Memory: 42.2 MB (Beats 100.00%)
 * Solved At: 2026-11-21 20:32:56 IST
 * Link: https://leetcode.com/problems/minimum-range-after-sum-operations/
 */


class Solution {

    public int minRange(int a, int b, int c) {

        int ans = solve(a, b, c);

        ans = Math.min(ans, solve(b + c, b, c));

        ans = Math.min(ans, solve(a, a + c, c));

        ans = Math.min(ans, solve(a, b, a + b));

        return ans;
    }

    private int solve(int a, int b, int c) {

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        return max - min;
    }
}
