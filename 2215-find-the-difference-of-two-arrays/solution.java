/*
 * Problem: Find the Difference of Two Arrays (LeetCode #2215)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 9 ms (Beats 98.21%)
 * Memory: 47.1 MB (Beats 96.30%)
 * Solved At: 2026-09-12 20:42:27
 * Link: https://leetcode.com/problems/find-the-difference-of-two-arrays/
 */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < n2; i++) {
            set2.add(nums2[i]);
        }
        List<Integer> l1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                l1.add(num);
            }
        }
        list.add(l1);
        List<Integer> l2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                l2.add(num);
            }
        }
        list.add(l2);
        return list;
    }
}