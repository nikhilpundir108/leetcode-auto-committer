/*
 * Problem: Intersection of Two Arrays II (LeetCode #350)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 3 ms (Beats 94.65%)
 * Memory: 45.1 MB (Beats 35.55%)
 * Solved At: 2026-09-08 19:03:01
 * Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[Math.min(n1, n2)];
        int k = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                res[k++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOf(res, k);
    }
}

