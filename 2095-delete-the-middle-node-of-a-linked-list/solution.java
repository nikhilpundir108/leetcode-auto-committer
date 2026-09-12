/*
 * Problem: Delete the Middle Node of a Linked List (LeetCode #2095)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 99.92%)
 * Memory: 202.9 MB (Beats 8.59%)
 * Solved At: 2026-07-23 05:23:22
 * Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
         if (head.next == null) {
            return null;
        }
        ListNode prev = null;
        ListNode slow =head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow;
     prev.next=mid.next;
        return head;
    }
}