/*
 * Problem: Find All Numbers Disappeared in an Array (LeetCode #448)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 19 ms (Beats 36.92%)
 * Memory: 73.8 MB (Beats 32.95%)
 * Solved At: 2026-09-12 21:53:39
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