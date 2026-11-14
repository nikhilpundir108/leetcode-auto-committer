/*
 * Problem: Rotting Oranges (LeetCode #994)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 91.05%)
 * Memory: 44 MB (Beats 43.56%)
 * Solved At: 2026-11-11 13:56:52 IST
 * Link: https://leetcode.com/problems/rotting-oranges/
 */


class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        int minutes = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }

                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            for (int k = 0; k < size; k++) {

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for (int[] d : dir) {

                    int newr = r + d[0];
                    int newc = c + d[1];

                    if (newr >= 0 && newr < n &&
                        newc >= 0 && newc < m &&
                        grid[newr][newc] == 1) {

                        grid[newr][newc] = 2;

                        fresh--;

                        q.offer(new int[]{newr, newc});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
