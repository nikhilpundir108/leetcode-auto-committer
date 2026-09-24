/*
 * Problem: Path Sum (LeetCode #112)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 45.1 MB (Beats 31.04%)
 * Solved At: 2026-09-24 23:54:23 IST
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
    public boolean findpath(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == target;
        }
        return findpath(root.left, target - root.val) ||
                findpath(root.right, target - root.val);

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findpath(root, targetSum);
    }
}