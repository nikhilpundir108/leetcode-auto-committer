/*
 * Problem: Find Numbers with Even Number of Digits (LeetCode #1295)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 99.49%)
 * Memory: 44.8 MB (Beats 22.03%)
 * Solved At: 2026-09-01 10:04:53
 * Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int count =0;
            while(n!=0){
                count++;
                n=n/10;
            }
            if(count%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
}