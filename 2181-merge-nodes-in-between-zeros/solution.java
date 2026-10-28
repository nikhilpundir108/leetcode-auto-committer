/*
 * Problem: Merge Nodes in Between Zeros (LeetCode #2181)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 4 ms (Beats 99.95%)
 * Memory: 224.6 MB (Beats 96.93%)
 * Solved At: 2026-10-23 17:49:06 IST
 * Link: https://leetcode.com/problems/merge-nodes-in-between-zeros/
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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        // ListNode dummy = head;
        ListNode temp = head.next;
        ListNode curr = head;
        while (temp != null) {
            if (temp.val == 0) {
                curr.val = sum;
                sum = 0;
                curr.next = temp.next;
                curr=curr.next;
            } else {
                sum += temp.val;
            }
            temp = temp.next;
        }
        return head;
    }
}