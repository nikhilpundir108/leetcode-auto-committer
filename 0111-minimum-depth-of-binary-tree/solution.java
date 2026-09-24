/*
 * Problem: Minimum Depth of Binary Tree (LeetCode #111)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 4 ms (Beats 71.84%)
 * Memory: 82.3 MB (Beats 13.21%)
 * Solved At: 2026-09-25 24:05:15 IST
 * Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/
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
    private int minlen=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
         if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(
            minDepth(root.left),
            minDepth(root.right)
        );
    }
}