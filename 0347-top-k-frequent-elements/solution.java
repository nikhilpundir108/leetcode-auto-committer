/*
 * Problem: Top K Frequent Elements (LeetCode #347)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 16 ms (Beats 47.02%)
 * Memory: 47 MB (Beats 88.75%)
 * Solved At: 2026-11-22 01:28:26 IST
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 */


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        for (int num : map.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }

        return ans;
    }
}
