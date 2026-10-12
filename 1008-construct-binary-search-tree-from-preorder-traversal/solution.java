/*
 * Problem: Construct Binary Search Tree from Preorder Traversal (LeetCode #1008)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.4 MB (Beats 74.55%)
 * Solved At: 2026-10-12 22:38:43 IST
 * Link: https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    int idx = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public TreeNode solve(int[] preorder, int min, int max) {
        if (idx == preorder.length) {
            return null;
        }
        int val = preorder[idx];
        if (val < min || val > max) {
            return null;
        }
        TreeNode root = new TreeNode(val);
        idx++;
        root.left = solve(preorder, min, val);
        root.right = solve(preorder, val, max);
        return root;
    }
}