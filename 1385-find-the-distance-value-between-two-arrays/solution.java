/*
 * Problem: Find the Distance Value Between Two Arrays (LeetCode #1385)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 99.79%)
 * Memory: 46.1 MB (Beats 69.20%)
 * Solved At: 2026-11-05 20:35:53 IST
 * Link: https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
 */

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
           int c = 0;
        for(int a : arr1){
            if(isValid(a, arr2, d)) c++;
        }
        return c;
    }
    boolean isValid(int a, int[] arr, int d){
        for(int e : arr){
            if(Math.abs(e - a) <= d) return false;
        }
        return true;
    }
}