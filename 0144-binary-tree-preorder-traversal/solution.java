/*
 * Problem: Binary Tree Preorder Traversal (LeetCode #144)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43 MB (Beats 85.22%)
 * Solved At: 2026-09-17 02:39:46 IST
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            list.add(node.val);
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
        return list;
    }
}