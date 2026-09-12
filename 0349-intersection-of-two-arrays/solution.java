/*
 * Problem: Intersection of Two Arrays (LeetCode #349)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 97.52%)
 * Memory: 45 MB (Beats 56.04%)
 * Solved At: 2026-07-31 20:54:37
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            res[i++] = num;
        }
        return res;
    }
}