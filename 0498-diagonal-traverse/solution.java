/*
 * Problem: Diagonal Traverse (LeetCode #498)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 14 ms (Beats 12.30%)
 * Memory: 48.3 MB (Beats 17.63%)
 * Solved At: 2026-09-11 11:01:00
 * Link: https://leetcode.com/problems/diagonal-traverse/
 */

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int key = i + j;
                map.putIfAbsent(i + j, new ArrayList<>());
                map.get(i + j).add(mat[i][j]);
            }
        }
        boolean flip = true;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m + n - 1; i++) {
            List<Integer> diag = map.get(i);
            if (flip) {
                Collections.reverse(diag);
            }
            res.addAll(diag);
            flip = !flip;
        }
        int ans[] = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}