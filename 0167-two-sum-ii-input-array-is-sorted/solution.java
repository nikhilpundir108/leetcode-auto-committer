/*
 * Problem: Two Sum II - Input Array Is Sorted (LeetCode #167)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 95.88%)
 * Memory: 47.9 MB (Beats 97.19%)
 * Solved At: 2026-07-21 05:20:54
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int l=0;
        int r=n;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                return new int[]{l+1,r+1} ;
            }else if(numbers[l]+numbers[r]>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}