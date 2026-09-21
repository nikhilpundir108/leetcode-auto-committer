/*
 * Problem: Binary Tree Maximum Path Sum (LeetCode #124)
 * Difficulty: Hard
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.9 MB (Beats 6.72%)
 * Solved At: 2026-09-21 20:29:54 IST
 * Link: https://leetcode.com/problems/binary-tree-maximum-path-sum/
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
    int totalSum = Integer.MIN_VALUE;

    public int findsum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findsum(root.left);
        int right = findsum(root.right);
        totalSum = Math.max(totalSum, root.val + left + right);
        int val=root.val + Math.max(left, right);
        return val < 0 ? 0 : val ;

    }
    public int maxPathSum(TreeNode root) {
        findsum(root);
        return totalSum;
    }
}