/*
 * Problem: Search in a Binary Search Tree (LeetCode #700)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.6 MB (Beats 94.25%)
 * Solved At: 2026-09-29 23:17:01 IST
 * Link: https://leetcode.com/problems/search-in-a-binary-search-tree/
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
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            }
            if (val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}