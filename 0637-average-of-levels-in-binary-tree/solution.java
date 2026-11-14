/*
 * Problem: Average of Levels in Binary Tree (LeetCode #637)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 2 ms (Beats 98.64%)
 * Memory: 48 MB (Beats 76.45%)
 * Solved At: 2026-11-14 16:42:28 IST
 * Link: https://leetcode.com/problems/average-of-levels-in-binary-tree/
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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            list.add(sum / size);
        }
        return list;
    }
}