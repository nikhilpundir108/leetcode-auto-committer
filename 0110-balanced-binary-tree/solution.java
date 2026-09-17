/*
 * Problem: Balanced Binary Tree (LeetCode #110)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 45.6 MB (Beats 59.89%)
 * Solved At: 2026-09-18 02:09:00 IST
 * Link: https://leetcode.com/problems/balanced-binary-tree/
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
    public int check(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = check(root.left);
        int right = check(root.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(right - left) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        int ans = check(root);
        return ans == -1 ? false : true;
    }
}