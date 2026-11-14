/*
 * Problem: Merge k Sorted Lists (LeetCode #23)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 1 ms (Beats 99.97%)
 * Memory: 46.3 MB (Beats 83.55%)
 * Solved At: 2026-11-13 15:42:45 IST
 * Link: https://leetcode.com/problems/merge-k-sorted-lists/
 */


class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        return divide(lists, 0, lists.length - 1);
    }

    public ListNode divide(ListNode[] lists, int left, int right) {

        if (left == right) {
            return lists[left];
        }

        int mid = left + (right - left) / 2;

        ListNode first = divide(lists, left, mid);
        ListNode second = divide(lists, mid + 1, right);

        return mergeTwoLists(first, second);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }

            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }
}
