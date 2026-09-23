/*
 * Problem: Binary Tree Right Side View (LeetCode #199)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.4 MB (Beats 92.04%)
 * Solved At: 2026-09-23 23:15:37 IST
 * Link: https://leetcode.com/problems/binary-tree-right-side-view/
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
    public void rightView(TreeNode root, int level, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root.val);
        }
        rightView(root.right, level + 1, list);
        rightView(root.left, level + 1, list);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root, 0, list);
        return list;
    }
}