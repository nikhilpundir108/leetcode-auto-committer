/*
 * Problem: Partition List (LeetCode #86)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.1 MB (Beats 99.64%)
 * Solved At: 2026-10-16 14:11:40 IST
 * Link: https://leetcode.com/problems/partition-list/
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
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = null;
            if (temp.val < x) {
                temp1.next = temp;
                temp1 = temp1.next;
            } else {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = next;
        }
        temp1.next = l2.next;
        return l1.next;
    }
}