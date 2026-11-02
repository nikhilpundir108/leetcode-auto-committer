/*
 * Problem: Split Linked List in Parts (LeetCode #725)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.2 MB (Beats 96.67%)
 * Solved At: 2026-11-02 15:09:11 IST
 * Link: https://leetcode.com/problems/split-linked-list-in-parts/
 */


class Solution {
    public int len(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];

        int n = len(head);
        int m = n / k;
        int r = n % k;

        int i = 0;

        while (i < k) {

            if (head == null) {
                arr[i] = null;
            } else {
                ListNode temp = head;
                int size = (r > 0) ? m + 1 : m;

                int count = 1;

                while (count < size) {
                    temp = temp.next;
                    count++;
                }

                ListNode next = temp.next;
                temp.next = null;

                arr[i] = head;
                head = next;

                if (r > 0) {
                    r--;
                }
            }

            i++;
        }

        return arr;
    }
}
