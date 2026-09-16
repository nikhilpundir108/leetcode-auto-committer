/*
 * Problem: Binary Tree Inorder Traversal (LeetCode #94)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.3 MB (Beats 15.11%)
 * Solved At: 2026-09-17 01:17:22 IST
 * Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    private List<Integer> recursion(TreeNode node, List<Integer> list){
        if(node == null) return list;
        recursion(node.left,list);
        list.add(node.val);
        recursion(node.right,list);
        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        return recursion(root,lst);
    }
}