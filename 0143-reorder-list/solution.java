/*
 * Problem: Reorder List (LeetCode #143)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 86.77%)
 * Memory: 49.5 MB (Beats 13.94%)
 * Solved At: 2026-07-28 13:09:56
 * Link: https://leetcode.com/problems/reorder-list/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode head1 = head;
        ListNode right = mid.next;
        mid.next = null;
        ListNode prev = null;
        ListNode curr = right;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode head2 = prev;
        ListNode nextLeft;
        ListNode nextRight;
        while (head1 != null && head2 != null) {
            nextLeft = head1.next;
            head1.next = head2;
            nextRight = head2.next;
            head2.next = nextLeft;

            head1 = nextLeft;
            head2 = nextRight;
        }
        
    }
}