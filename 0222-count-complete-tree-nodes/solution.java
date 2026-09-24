/*
 * Problem: Count Complete Tree Nodes (LeetCode #222)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 49.2 MB (Beats 83.17%)
 * Solved At: 2026-09-24 22:58:21 IST
 * Link: https://leetcode.com/problems/count-complete-tree-nodes/
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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int getLeftHeight(TreeNode root) {
        int height = 0;

        while (root != null) {
            height++;
            root = root.left;
        }

        return height;
    }

    private int getRightHeight(TreeNode root) {
        int height = 0;

        while (root != null) {
            height++;
            root = root.right;
        }

        return height;
    }
}