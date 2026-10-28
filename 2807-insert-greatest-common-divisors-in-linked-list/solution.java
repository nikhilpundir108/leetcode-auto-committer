/*
 * Problem: Insert Greatest Common Divisors in Linked List (LeetCode #2807)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 51.85%)
 * Memory: 46.6 MB (Beats 94.21%)
 * Solved At: 2026-10-25 14:17:18 IST
 * Link: https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
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
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            ListNode newNode = new ListNode(gcd(temp.val, temp.next.val));
            ListNode next = temp.next;
            temp.next = newNode;
            newNode.next = next;
            temp = next;
        }
        return head;
    }
}