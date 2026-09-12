/*
 * Problem: Largest Number At Least Twice of Others (LeetCode #747)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.1 MB (Beats 71.60%)
 * Solved At: 2026-09-01 09:21:22
 * Link: https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 */

class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
            max=Math.max(max,nums[i]);
                idx=i;
            }
        }
        for(int a:nums){
            if(max==a){
                continue;
            }
            if(max<(a*2)){
                return -1;
            }
        }
        return idx;
    }
}