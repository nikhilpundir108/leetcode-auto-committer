/*
 * Problem: Distribute Candies (LeetCode #575)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 39 ms (Beats 9.12%)
 * Memory: 48.2 MB (Beats 69.97%)
 * Solved At: 2026-11-11 11:56:37 IST
 * Link: https://leetcode.com/problems/distribute-candies/
 */

class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Arrays.sort(candyType);
        int unique=1;
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                unique++;
            }
        }
        return unique>n/2?n/2:unique;
    }
}