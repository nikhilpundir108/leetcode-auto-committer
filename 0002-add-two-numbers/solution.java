/*
 * Problem: Add Two Numbers (LeetCode #2)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 8.50%)
 * Memory: 46 MB (Beats 95.18%)
 * Solved At: 2026-10-18 15:26:06 IST
 * Link: https://leetcode.com/problems/add-two-numbers/
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = 0;
            int y = 0;
            if (l1 != null && l2 != null) {
                x = l1.val;
                y = l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null && l2 == null) {
                x = l1.val;
                y = 0;
                l1 = l1.next;
            } else if (l1 == null && l2 != null) {
                x = 0;
                y = l2.val;
                l2 = l2.next;
            } else if (l1 == null && l2 == null) {
                x = 0;
                y = 0;
            }

            int sum = x + y + carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;

        }
        return dummy.next;
    }
}