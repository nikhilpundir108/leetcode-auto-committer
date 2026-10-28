/*
 * Problem: Subarray Sums Divisible by K (LeetCode #974)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 27 ms (Beats 9.97%)
 * Memory: 51.1 MB (Beats 72.05%)
 * Solved At: 2026-10-28 10:48:35 IST
 * Link: https://leetcode.com/problems/subarray-sums-divisible-by-k/
 */

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            int rem = sum % k;

            if (rem < 0) {
                rem += k;
            }

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}