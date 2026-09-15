/*
 * Problem: Delete Node in a Linked List (LeetCode #237)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 45.1 MB (Beats 62.52%)
 * Solved At: 2026-09-15 11:57:29 IST
 * Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}