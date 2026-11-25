/*
 * Problem: Rank Transform of an Array (LeetCode #1331)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 31 ms (Beats 61.64%)
 * Memory: 76.2 MB (Beats 42.86%)
 * Solved At: 2026-11-25 12:26:08 IST
 * Link: https://leetcode.com/problems/rank-transform-of-an-array/
 */

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for (int num : sorted) {

            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
