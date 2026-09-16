/*
 * Problem: Binary Tree Postorder Traversal (LeetCode #145)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43 MB (Beats 85.40%)
 * Solved At: 2026-09-17 01:25:22 IST
 * Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
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
        recursion(node.left, list);
        recursion(node.right, list);
        list.add(node.val);
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return recursion(root, list);
    }
}