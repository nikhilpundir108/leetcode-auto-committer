/*
 * Problem: Build an Array With Stack Operations (LeetCode #1441)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.9 MB (Beats 100.00%)
 * Solved At: 2026-11-07 01:33:30 IST
 * Link: https://leetcode.com/problems/build-an-array-with-stack-operations/
 */

class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int i = 1;

        for (int num : target) {
            while (i < num) {
                list.add("Push");
                list.add("Pop");
                i++;
            }

            list.add("Push");
            i++;
        }

        return list;
    }
}