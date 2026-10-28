/*
 * Problem: Count Days Spent Together (LeetCode #2409)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42 MB (Beats 78.53%)
 * Solved At: 2026-10-24 15:58:28 IST
 * Link: https://leetcode.com/problems/count-days-spent-together/
 */

class Solution {
    public int calDays(String date) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int total = day;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }
        return total;
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start = Math.max(calDays(arriveAlice), calDays(arriveBob));
        int end = Math.min(calDays(leaveAlice), calDays(leaveBob));
        return Math.max(0, end - start + 1);
    }
}