/*
 * Problem: Path Sum (LeetCode #112)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.5 MB (Beats 95.61%)
 * Solved At: 2026-09-25 11:08:28 IST
 * Link: https://leetcode.com/problems/path-sum/
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
    public boolean path(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return target == root.val;
        }
        return path(root.left, target - root.val) ||
                path(root.right, target - root.val);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root, targetSum);
    }
}