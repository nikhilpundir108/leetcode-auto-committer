/*
 * Problem: Pascal's Triangle (LeetCode #118)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 95.37%)
 * Memory: 43.6 MB (Beats 34.40%)
 * Solved At: 2026-09-11 08:38:51
 * Link: https://leetcode.com/problems/pascals-triangle/
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        ans.add(row);
        int mid = 0;
        for (int i = 1; i < numRows; i++) {
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
        return ans;
    }
}