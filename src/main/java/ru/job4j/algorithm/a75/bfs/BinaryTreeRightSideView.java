package ru.job4j.algorithm.a75.bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            result.add(stack.peekLast().val);
            for (int i = stack.size() - 1; i >= 0; i--) {
                TreeNode node = stack.poll();
                if (node.left != null) {
                    stack.offer(node.left);
                }
                if (node.right != null) {
                    stack.offer(node.right);
                }
            }
        }
        return result;
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
