/*
 * Problem: Sum of Left Leaves (LeetCode #404)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.2 MB (Beats 48.76%)
 * Solved At: 2026-09-29 15:08:36 IST
 * Link: https://leetcode.com/problems/sum-of-left-leaves/
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
    public int sumLeaf(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.right == null && root.left.left == null) {
            sum += root.left.val;
        }
        sum += sumLeaf(root.left);
        sum += sumLeaf(root.right);
        return sum;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeaf(root);
        // return sum;
    }
}