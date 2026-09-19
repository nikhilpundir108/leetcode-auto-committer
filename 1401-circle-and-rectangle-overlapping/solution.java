/*
 * Problem: Circle and Rectangle Overlapping (LeetCode #1401)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42 MB (Beats 77.31%)
 * Solved At: 2026-09-19 16:47:04 IST
 * Link: https://leetcode.com/problems/circle-and-rectangle-overlapping/
 */

class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closeX = Math.max(x1, Math.min(x2, xCenter));
        int closeY = Math.max(y1, Math.min(y2, yCenter));
        int newx = xCenter - closeX;
        int newy = yCenter - closeY;
        return newx * newx + newy * newy <= radius * radius;
    }
}