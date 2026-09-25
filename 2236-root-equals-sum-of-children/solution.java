/*
 * Problem: Root Equals Sum of Children (LeetCode #2236)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43 MB (Beats 68.25%)
 * Solved At: 2026-09-25 21:03:47 IST
 * Link: https://leetcode.com/problems/root-equals-sum-of-children/
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
    public boolean check(TreeNode root) {
        if (root == null) {
            return false;
        }
        int child = 0;
        check(root.left);
        check(root.right);

        if (root.left != null) {
            child += root.left.val;
        }
        if (root.right != null) {
            child += root.right.val;
        }
        return child == root.val;
    }

    public boolean checkTree(TreeNode root) {
        return check(root);
    }
}