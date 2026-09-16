/*
 * Problem: Binary Tree Level Order Traversal (LeetCode #102)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1 ms (Beats 95.89%)
 * Memory: 47 MB (Beats 22.07%)
 * Solved At: 2026-09-17 01:44:04 IST
 * Link: https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();
         if (root == null) {
            return mainList;
        }
        Queue<TreeNode> q =new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                
           TreeNode  node = q.poll();
            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
            level.add(node.val);
            }
            mainList.add(level);
        }
        return mainList;
    }
}