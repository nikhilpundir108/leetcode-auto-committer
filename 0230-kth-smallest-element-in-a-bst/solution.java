/*
 * Problem: Kth Smallest Element in a BST (LeetCode #230)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.8 MB (Beats 51.68%)
 * Solved At: 2026-10-09 22:42:35 IST
 * Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/
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
    int i = 0;
    int val = -1;

    public void find(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        find(root.left, k);
        i++;
        if (i == k) {
            val = root.val;
        }
        find(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        find(root, k);
        return val;
    }
}