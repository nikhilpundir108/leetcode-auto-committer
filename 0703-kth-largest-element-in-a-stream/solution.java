/*
 * Problem: Kth Largest Element in a Stream (LeetCode #703)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 22 ms (Beats 90.77%)
 * Memory: 51.6 MB (Beats 84.49%)
 * Solved At: 2026-11-21 19:52:04 IST
 * Link: https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */

class KthLargest {
    PriorityQueue<Integer> q;
    int k;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        q.offer(val);

        if (q.size() > k) {
            q.poll();
        }

        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */