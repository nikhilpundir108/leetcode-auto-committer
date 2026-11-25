/*
 * Problem: Merge k Sorted Lists (LeetCode #23)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 6 ms (Beats 27.06%)
 * Memory: 46.3 MB (Beats 77.44%)
 * Solved At: 2026-11-25 12:11:27 IST
 * Link: https://leetcode.com/problems/merge-k-sorted-lists/
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (!pq.isEmpty()) {
            ListNode curr = pq.poll();
            temp.next = curr;
            temp = temp.next;

            if (curr.next != null) {
                pq.offer(curr.next);
            }
        }
        temp.next = null;
        return dummy.next;
    }
}