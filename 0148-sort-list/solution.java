/*
 * Problem: Sort List (LeetCode #148)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 11 ms (Beats 36.40%)
 * Memory: 59.5 MB (Beats 48.38%)
 * Solved At: 2026-07-24 09:21:41
 * Link: https://leetcode.com/problems/sort-list/
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
    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode getMerge(ListNode left, ListNode right) {
        ListNode mergeLL = new ListNode(-1);
        ListNode temp = mergeLL;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
            if(left!=null){
                temp.next=left;
            }else{
                temp.next=right;
            }
        }
        // while (left != null) {
        //     temp.next = left;
        //     left = left.next;
        //     temp = temp.next;
        // }
        // while (right != null) {
        //     temp.next = right;
        //     right = right.next;
        //     temp = temp.next;
        // }
        return mergeLL.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        ListNode leftSort = sortList(left);
        ListNode rightSort = sortList(right);

        return getMerge(leftSort, rightSort);
    }

}