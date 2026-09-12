/*
 * Problem: Rotate List (LeetCode #61)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.3 MB (Beats 62.68%)
 * Solved At: 2026-08-02 17:27:12
 * Link: https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        ListNode tail = temp;
         k = k % size;
        if (k == 0) {
            return head;
        }
        int n = size-k;

        temp = head;
        for (int i = 1; i < n; i++) {
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        tail.next = head;
        head = newHead;
        return head;
    }
}
