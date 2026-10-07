/*
 * Problem: Sum Root to Leaf Numbers (LeetCode #129)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 42.6 MB (Beats 95.85%)
 * Solved At: 2026-10-07 16:07:08 IST
 * Link: https://leetcode.com/problems/sum-root-to-leaf-numbers/
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
    int totalSum = 0;

    public void solve(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            totalSum += sum;
            return;
        }
        solve(root.left, sum);
        solve(root.right, sum);
    }

    public int sumNumbers(TreeNode root) {
        solve(root, 0);
        return totalSum;
    }
}