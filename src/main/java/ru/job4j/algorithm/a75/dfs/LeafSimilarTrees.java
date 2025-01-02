package ru.job4j.algorithm.a75.dfs;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = traversal(root1);
        List<Integer> list2 = traversal(root2);
        return list1.equals(list2);
    }

    private List<Integer> traversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> leaves = traversal(root.left);
        leaves.addAll(traversal(root.right));
        if (leaves.isEmpty()) {
            leaves.add(root.val);
        }
        return leaves;
    }
}
