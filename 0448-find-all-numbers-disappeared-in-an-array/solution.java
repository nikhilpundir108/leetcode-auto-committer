/*
 * Problem: Find All Numbers Disappeared in an Array (LeetCode #448)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 21 ms (Beats 21.72%)
 * Memory: 73.9 MB (Beats 27.52%)
 * Solved At: 2026-11-05 20:55:29 IST
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}