/*
 * Problem: Remove Nth Node From End of List (LeetCode #19)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.3 MB (Beats 76.67%)
 * Solved At: 2026-07-28 12:47:51
 * Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            return head.next;
        }
        int i = 1;
        int k = size - n;
        temp = head;
        while (i < k) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}