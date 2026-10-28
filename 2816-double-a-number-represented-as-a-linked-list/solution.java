/*
 * Problem: Double a Number Represented as a Linked List (LeetCode #2816)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms (Beats 86.28%)
 * Memory: 47.7 MB (Beats 94.83%)
 * Solved At: 2026-10-23 17:14:48 IST
 * Link: https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/
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
    public ListNode doubleIt(ListNode head) {
        if (head.val > 4) {
            head = new ListNode(0, head);
        }
        ListNode temp = head;
        while (temp != null) {
            int nextval = 0;
            temp.val = (temp.val * 2) % 10;
            if (temp.next != null && temp.next.val > 4) {
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }
}