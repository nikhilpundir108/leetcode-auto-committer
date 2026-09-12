/*
 * Problem: Intersection of Two Linked Lists (LeetCode #160)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 47.42%)
 * Memory: 53 MB (Beats 12.53%)
 * Solved At: 2026-07-24 10:23:19
 * Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            } else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            } else {
                p2 = p2.next;
            }
        }
        return p1;
    }
}