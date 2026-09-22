/*
 * Problem: Zigzag Grid Traversal With Skip (LeetCode #3417)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 47.6 MB (Beats 5.10%)
 * Solved At: 2026-09-22 16:03:49 IST
 * Link: https://leetcode.com/problems/zigzag-grid-traversal-with-skip/
 */

class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<row;i++){
            if(i%2!=0){
                for(int j=col-1;j>=0;j--){
                    if((i+j)%2==0){
                        list.add(grid[i][j]);
                    }
                }
            }else{
                for(int j=0;j<col;j++){
                    if((i+j)%2==0){
                        list.add(grid[i][j]);
                    }
                }
            }
        }
        return list;
    }
}