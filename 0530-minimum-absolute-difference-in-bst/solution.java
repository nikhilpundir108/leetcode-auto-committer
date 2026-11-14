/*
 * Problem: Minimum Absolute Difference in BST (LeetCode #530)
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 46.2 MB (Beats 92.71%)
 * Solved At: 2026-11-11 15:38:37 IST
 * Link: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 */

class Solution {

    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    public void solve(TreeNode root) {

        if (root == null) {
            return;
        }

        solve(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }

        prev = root;

        solve(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return min;
    }
}