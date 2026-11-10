/*
 * Problem: Majority Element II (LeetCode #229)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 15 ms (Beats 29.45%)
 * Memory: 52.7 MB (Beats 23.40%)
 * Solved At: 2026-11-10 15:12:19 IST
 * Link: https://leetcode.com/problems/majority-element-ii/
 */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet() ){
            if(map.get(key)>n/3){
                list.add(key);
            }  
        }
        return list;
    }
}