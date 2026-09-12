/*
 * Problem: Contains Duplicate (LeetCode #217)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 18 ms (Beats 76.75%)
 * Memory: 107.2 MB (Beats 71.01%)
 * Solved At: 2026-07-31 23:07:08
 * Link: https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}