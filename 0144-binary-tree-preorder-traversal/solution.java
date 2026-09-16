/*
 * Problem: Binary Tree Preorder Traversal (LeetCode #144)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.2 MB (Beats 32.79%)
 * Solved At: 2026-09-17 01:24:37 IST
 * Link: https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    private List<Integer> recursion(TreeNode node, List<Integer> list) {
        if (node == null)
            return list;
        list.add(node.val);
        recursion(node.left, list);
        recursion(node.right, list);
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return recursion(root,list);
    }
}