/*
 * Problem: Find Missing and Repeated Values (LeetCode #2965)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.32%)
 * Memory: 45.5 MB (Beats 99.92%)
 * Solved At: 2025-09-14 15:10:23
 * Link: https://leetcode.com/problems/find-missing-and-repeated-values/
 */

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeat=-1; int missing = -1;
        int n=grid.length; int N=n*n;
        int count [] =new int[N+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                count[grid[i][j]]++;
            }
        } 
        for(int i=1;i<=N;i++){
          if(count[i]==2){
            repeat=i;
          }
          if(count[i]==0){
            missing=i;
          }
        }
        return new int[]{repeat,missing};
    }
}