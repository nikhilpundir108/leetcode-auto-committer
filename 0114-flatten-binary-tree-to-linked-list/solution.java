/*
 * Problem: Flatten Binary Tree to Linked List (LeetCode #114)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 44.1 MB (Beats 33.29%)
 * Solved At: 2026-09-26 24:43:37 IST
 * Link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
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
    public void flatten(TreeNode root) {
        while(root!=null){
            if(root.left!=null){
                TreeNode temp=root.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=root.right;
                root.right=root.left;
                root.left=null;
            }
            root=root.right;
        }
    }
}