/*
 * Problem: Pascal's Triangle II (LeetCode #119)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 23.60%)
 * Memory: 42.9 MB (Beats 7.51%)
 * Solved At: 2026-09-11 09:32:50
 * Link: https://leetcode.com/problems/pascals-triangle-ii/
 */

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        ans.add(row);
        int mid = 0;
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j <= mid; j++) {
                int el = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                curr.add(el);
            }
            curr.add(1);
            ans.add(curr);
            mid++;
        }
        return ans.get(rowIndex);
    }
}