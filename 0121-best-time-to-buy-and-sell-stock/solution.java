/*
 * Problem: Best Time to Buy and Sell Stock (LeetCode #121)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.95%)
 * Memory: 94.4 MB (Beats 51.50%)
 * Solved At: 2026-09-08 09:05:55
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(profit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return profit;
    }
}