package ru.job4j.algorithm.a75.dfs;

public class LongestZigZagPathInABinaryTree {
    private int maxLength;

    public int longestZigZag(TreeNode root) {
        maxLength = 0;
        dfs(root, 0, 0);
        return maxLength;
    }

    private void dfs(TreeNode root, int left, int right) {
        if (root == null) {
            return;
        }
        maxLength = Math.max(maxLength, Math.max(left, right));
        dfs(root.left, right + 1, 0);
        dfs(root.right, 0, left + 1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
