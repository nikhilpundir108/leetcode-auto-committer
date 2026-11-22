/*
 * Problem: Construct Binary Tree from Preorder and Inorder Traversal (LeetCode #105)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 2 ms (Beats 82.53%)
 * Memory: 46.4 MB (Beats 26.80%)
 * Solved At: 2026-11-22 19:52:51 IST
 * Link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
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
    HashMap<Integer, Integer> map = new HashMap<>();
    int idx = 0;

    public TreeNode solve(int[] preorder, int l, int r) {
        if (l > r) {
            return null;
        }
        int val = preorder[idx++];
        TreeNode root = new TreeNode(val);
        int mid = map.get(val);
        root.left = solve(preorder, l, mid - 1);
        root.right = solve(preorder, mid + 1, r);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return solve(preorder, 0, preorder.length - 1);
    }
}