/*
 * Problem: Binary Tree Level Order Traversal II (LeetCode #107)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 98.03%)
 * Memory: 43.9 MB (Beats 98.39%)
 * Solved At: 2026-09-25 24:34:28 IST
 * Link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)  return list;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> s = new Stack<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            s.push(level);
        }
        while (!s.isEmpty()) {
            list.add(s.pop());
        }
        return list;
    }
}