/*
 * Problem: Remove Duplicates from Sorted List II (LeetCode #82)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 16.14%)
 * Memory: 44.7 MB (Beats 89.72%)
 * Solved At: 2026-10-19 15:03:22 IST
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 */


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp1 = dummy;
        ListNode temp2 = head;

        while (temp2 != null) {
            if (temp2.next != null &&
                temp2.val == temp2.next.val) {

                while (temp2.next != null &&
                       temp2.val == temp2.next.val) {
                    temp2 = temp2.next;
                }

                temp1.next = temp2.next;
            } else {
                temp1 = temp1.next;
            }

            temp2 = temp2.next;
        }

        return dummy.next;
    }
}
