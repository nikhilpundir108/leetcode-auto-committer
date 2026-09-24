/*
 * Problem: Lowest Common Ancestor of a Binary Tree (LeetCode #236)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 17 ms (Beats 23.52%)
 * Memory: 70.1 MB (Beats 8.70%)
 * Solved At: 2026-09-24 22:38:14 IST
 * Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left != null && right != null) {
            return root;
        }
        return root;
    }
}