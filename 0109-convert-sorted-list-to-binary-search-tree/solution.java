/*
 * Problem: Convert Sorted List to Binary Search Tree (LeetCode #109)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 156 ms (Beats 1.35%)
 * Memory: 46.7 MB (Beats 67.30%)
 * Solved At: 2026-10-22 12:23:34 IST
 * Link: https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int len(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public TreeNode solve(ListNode head, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        ListNode temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        TreeNode root = new TreeNode(temp.val);

        root.left = solve(head, left, mid - 1);
        root.right = solve(head, mid + 1, right);

        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        int n = len(head);
        return solve(head, 0, n - 1);
    }
}