/*
 * Problem: Swap Nodes in Pairs (LeetCode #24)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.2 MB (Beats 28.47%)
 * Solved At: 2026-10-13 15:11:34 IST
 * Link: https://leetcode.com/problems/swap-nodes-in-pairs/
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null && temp.next.next != null) {
            ListNode a = temp.next;
            ListNode b = temp.next.next;

            a.next = b.next;
            b.next = a;
            temp.next = b;

            temp = a;
        }
        return dummy.next;
    }
}