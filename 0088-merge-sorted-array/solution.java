/*
 * Problem: Merge Sorted Array (LeetCode #88)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.9 MB (Beats 30.38%)
 * Solved At: 2026-09-02 10:07:45
 * Link: https://leetcode.com/problems/merge-sorted-array/
 */

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       int i=m-1;
       int j=n-1;
       int k=m+n-1;

       while(i>=0 && j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k]=nums1[i];
            k--;
            i--;
        }else{
            nums1[k]=nums2[j];
            j--;
            k--;
        }
       }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }

    }
}