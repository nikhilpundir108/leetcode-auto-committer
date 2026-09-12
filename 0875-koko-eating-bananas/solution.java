/*
 * Problem: Koko Eating Bananas (LeetCode #875)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms (Beats 99.77%)
 * Memory: 47.9 MB (Beats 42.69%)
 * Solved At: 2026-04-08 06:00:59
 * Link: https://leetcode.com/problems/koko-eating-bananas/
 */

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = getMax(piles);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = gethrs(piles, mid);
            if (total <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int getMax(int[] piles) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    public static long gethrs(int[] piles, int k) {
        long total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += ((piles[i] + k - 1) / k);
        }
        return total;
    }
}