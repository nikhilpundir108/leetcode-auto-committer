/*
 * Problem: Kth Missing Positive Number (LeetCode #1539)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.7 MB (Beats 40.52%)
 * Solved At: 2026-04-09 13:04:34
 * Link: https://leetcode.com/problems/kth-missing-positive-number/
 */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low+k;
        
    }
}