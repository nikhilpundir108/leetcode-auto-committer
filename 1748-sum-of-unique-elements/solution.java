/*
 * Problem: Sum of Unique Elements (LeetCode #1748)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms (Beats 71.07%)
 * Memory: 43.2 MB (Beats 36.57%)
 * Solved At: 2026-09-11 06:50:46
 * Link: https://leetcode.com/problems/sum-of-unique-elements/
 */

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}