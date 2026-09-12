/*
 * Problem: Minimum Number of Days to Make m Bouquets (LeetCode #1482)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 16 ms (Beats 91.32%)
 * Memory: 82.6 MB (Beats 67.09%)
 * Solved At: 2026-09-03 09:55:36
 * Link: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
 */

class Solution {
    public boolean findDay(int[] bloomDay, int mid, int m, int k) {
        int count = 0;
        int bouquet = 0;
        for (int bloom : bloomDay) {
            if (bloom <= mid) {
                count++;
                if (count == k) {
                    bouquet++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquet >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int max = bloomDay[0];
        for (int i = 1; i < bloomDay.length; i++) {
            max = Math.max(max, bloomDay[i]);
        }
        int low = 1;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (findDay(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}