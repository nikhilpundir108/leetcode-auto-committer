/*
 * Problem: Binary Tree Tilt (LeetCode #563)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.2 MB (Beats 87.73%)
 * Solved At: 2026-10-22 14:48:29 IST
 * Link: https://leetcode.com/problems/binary-tree-tilt/
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
    int sum = 0;

    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = solve(root.left);
        int right = solve(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        solve(root);
        return sum;
    }
}