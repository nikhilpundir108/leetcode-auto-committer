/*
 * Problem: Swapping Nodes in a Linked List (LeetCode #1721)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 100.00%)
 * Memory: 118 MB (Beats 96.24%)
 * Solved At: 2026-10-22 11:44:14 IST
 * Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
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
    // public int len(ListNode head) {
    //     int count = 0;
    //     ListNode temp = head;
    //     while (temp != null) {
    //         count++;
    //         temp = temp.next;
    //     }
    //     return count;
    // }

    public void swap(ListNode head, ListNode left, ListNode right) {
        int temp = left.val;
        left.val = right.val;
        right.val = temp;
    }

    public ListNode swapNodes(ListNode head, int k) {
        int start = k;
        // int end = len(head) - k + 1;

        ListNode left = head;
        ListNode right = head;
        for (int i = 1; i < start; i++) {
            left = left.next;
        }
        // for (int i = 1; i < end; i++) {
        //     right = right.next;
        // }
        ListNode temp = left;
        while (temp.next != null) {
            temp = temp.next;
            right = right.next;
        }
        swap(head, left, right);
        return head;
    }
}