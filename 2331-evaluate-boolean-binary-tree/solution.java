/*
 * Problem: Evaluate Boolean Binary Tree (LeetCode #2331)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.3 MB (Beats 64.15%)
 * Solved At: 2026-09-29 15:32:18 IST
 * Link: https://leetcode.com/problems/evaluate-boolean-binary-tree/
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
    public boolean evaluate(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        boolean left = evaluate(root.left);
        boolean right = evaluate(root.right);
        if (root.val == 2) {
            return left || right;
        }
        return left && right;
    }

    public boolean evaluateTree(TreeNode root) {
        return evaluate(root);
    }
}