/*
 * Problem: Lowest Common Ancestor of a Binary Search Tree (LeetCode #235)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 6 ms (Beats 97.17%)
 * Memory: 47.8 MB (Beats 17.35%)
 * Solved At: 2026-10-09 23:38:29 IST
 * Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
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
    public TreeNode find(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        if (p.val > root.val && q.val > root.val) {
            return find(root.right, p, q);
        }
        if (p.val < root.val && q.val < root.val) {
            return find(root.left, p, q);
        }
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root, p, q);
    }
}