# [0105. Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)

## Difficulty: `Medium` | Topics: `Array` `Hash Table` `Divide and Conquer` `Tree` `Binary Tree`

---

## 📝 Problem Statement

Given two integer arrays `preorder` and `inorder` where `preorder` is the preorder traversal of a binary tree and `inorder` is the inorder traversal of the same tree, construct and return *the binary tree*.

 

**Example 1:**

```
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
```

**Example 2:**

```
Input: preorder = [-1], inorder = [-1]
Output: [-1]
```

 

**Constraints:**

	- `1 <= preorder.length <= 3000`

	- `inorder.length == preorder.length`

	- `-3000 <= preorder[i], inorder[i] <= 3000`

	- `preorder` and `inorder` consist of **unique** values.

	- Each value of `inorder` also appears in `preorder`.

	- `preorder` is **guaranteed** to be the preorder traversal of the tree.

	- `inorder` is **guaranteed** to be the inorder traversal of the tree.

---

## 📈 Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 82.53%)
- **Memory:** 46.4 MB (Beats 26.80%)
- **Submission Date:** 2026-11-22 19:52:51 IST
- **LeetCode Link:** [View Problem](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
