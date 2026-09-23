/*
 * Problem: Binary Tree Zigzag Level Order Traversal (LeetCode #103)
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms (Beats 100.00%)
 * Memory: 43.5 MB (Beats 79.40%)
 * Solved At: 2026-09-23 22:52:50 IST
 * Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        boolean flag = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            Integer[] level = new Integer[size];

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                int idx = flag ? i : size - 1 - i;
                level[idx] = node.val;

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }
            }

            list.add(Arrays.asList(level));
            flag = !flag;
        }

        return list;
    }
}