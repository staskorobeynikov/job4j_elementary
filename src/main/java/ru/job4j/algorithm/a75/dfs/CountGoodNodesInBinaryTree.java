package ru.job4j.algorithm.a75.dfs;

public class CountGoodNodesInBinaryTree {
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

    private int num = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, Integer.MIN_VALUE);
        return num;
    }

    private void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (max <= root.val) {
            num++;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
}
