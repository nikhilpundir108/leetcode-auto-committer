/*
 * Problem: Reverse Linked List II (LeetCode #92)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.4 MB (Beats 98.28%)
 * Solved At: 2026-10-22 10:45:06 IST
 * Link: https://leetcode.com/problems/reverse-linked-list-ii/
 */


class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for (int i = 1; i < left; i++) {
            temp = temp.next;
        }

        ListNode newhead = temp.next;
        ListNode end = newhead;

        for (int i = left; i < right; i++) {
            end = end.next;
        }

        ListNode last = end.next;
        end.next = null;

        ListNode prev = null;
        ListNode curr = newhead;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        temp.next = prev;

        while (prev.next != null) {
            prev = prev.next;
        }

        prev.next = last;

        return dummy.next;
    }
}
