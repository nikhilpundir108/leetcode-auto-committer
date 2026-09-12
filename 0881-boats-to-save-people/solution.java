/*
 * Problem: Boats to Save People (LeetCode #881)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 20 ms (Beats 81.71%)
 * Memory: 56.7 MB (Beats 21.04%)
 * Solved At: 2026-09-07 09:38:16
 * Link: https://leetcode.com/problems/boats-to-save-people/
 */

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        int count = 0;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            } 
            r--;
            count++;
        }
        return count;
    }
}