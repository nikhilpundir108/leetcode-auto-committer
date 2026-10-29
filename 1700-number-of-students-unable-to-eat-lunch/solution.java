/*
 * Problem: Number of Students Unable to Eat Lunch (LeetCode #1700)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.5 MB (Beats 96.12%)
 * Solved At: 2026-10-29 11:09:11 IST
 * Link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
 */

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0 = 0;
        int count1 = 0;

        // Count student preferences
        for (int student : students) {
            if (student == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        // Process sandwiches from top to bottom
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (count0 == 0) {
                    return count1;
                }
                count0--;
            } else {
                if (count1 == 0) {
                    return count0;
                }
                count1--;
            }
        }

        return 0;
    }
}