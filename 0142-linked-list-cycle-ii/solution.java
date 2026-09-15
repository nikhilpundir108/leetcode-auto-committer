/*
 * Problem: Linked List Cycle II (LeetCode #142)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.9 MB (Beats 13.58%)
 * Solved At: 2026-09-15 11:11:34 IST
 * Link: https://leetcode.com/problems/linked-list-cycle-ii/
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }            
        }
            return null;

    }
}