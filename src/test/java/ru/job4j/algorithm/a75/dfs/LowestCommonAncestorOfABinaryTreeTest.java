package ru.job4j.algorithm.a75.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class LowestCommonAncestorOfABinaryTreeTest {
    @Test
    void testSimpleTree() {
        LowestCommonAncestorOfABinaryTree treeHelper = new LowestCommonAncestorOfABinaryTree();
        LowestCommonAncestorOfABinaryTree.TreeNode root = createTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}, treeHelper);
        LowestCommonAncestorOfABinaryTree.TreeNode p = findNode(root, 5);
        LowestCommonAncestorOfABinaryTree.TreeNode q = findNode(root, 1);

        LowestCommonAncestorOfABinaryTree.TreeNode result = treeHelper.lowestCommonAncestor(root, p, q);
        assertEquals(3, result.val, "Expected LCA for nodes 5 and 1 to be 3");
    }

    @Test
    void testLeftSubtree() {
        LowestCommonAncestorOfABinaryTree treeHelper = new LowestCommonAncestorOfABinaryTree();
        LowestCommonAncestorOfABinaryTree.TreeNode root = createTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}, treeHelper);
        LowestCommonAncestorOfABinaryTree.TreeNode p = findNode(root, 5);
        LowestCommonAncestorOfABinaryTree.TreeNode q = findNode(root, 4);

        LowestCommonAncestorOfABinaryTree.TreeNode result = treeHelper.lowestCommonAncestor(root, p, q);
        assertEquals(5, result.val, "Expected LCA for nodes 5 and 4 to be 5");
    }

    @Test
    void testRightSubtree() {
        LowestCommonAncestorOfABinaryTree treeHelper = new LowestCommonAncestorOfABinaryTree();
        LowestCommonAncestorOfABinaryTree.TreeNode root = createTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}, treeHelper);
        LowestCommonAncestorOfABinaryTree.TreeNode p = findNode(root, 0);
        LowestCommonAncestorOfABinaryTree.TreeNode q = findNode(root, 8);

        LowestCommonAncestorOfABinaryTree.TreeNode result = treeHelper.lowestCommonAncestor(root, p, q);
        assertEquals(1, result.val, "Expected LCA for nodes 0 and 8 to be 1");
    }

    @Test
    void testRootIsAncestor() {
        LowestCommonAncestorOfABinaryTree treeHelper = new LowestCommonAncestorOfABinaryTree();
        LowestCommonAncestorOfABinaryTree.TreeNode root = createTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}, treeHelper);
        LowestCommonAncestorOfABinaryTree.TreeNode p = findNode(root, 6);
        LowestCommonAncestorOfABinaryTree.TreeNode q = findNode(root, 4);

        LowestCommonAncestorOfABinaryTree.TreeNode result = treeHelper.lowestCommonAncestor(root, p, q);
        assertEquals(5, result.val, "Expected LCA for nodes 6 and 4 to be 5");
    }

    @Test
    void testNodesOnSamePath() {
        LowestCommonAncestorOfABinaryTree treeHelper = new LowestCommonAncestorOfABinaryTree();
        LowestCommonAncestorOfABinaryTree.TreeNode root = createTree(new Integer[]{3, 5, 1, 6, null, null, null}, treeHelper);
        LowestCommonAncestorOfABinaryTree.TreeNode p = findNode(root, 5);
        LowestCommonAncestorOfABinaryTree.TreeNode q = findNode(root, 6);

        LowestCommonAncestorOfABinaryTree.TreeNode result = treeHelper.lowestCommonAncestor(root, p, q);
        assertEquals(5, result.val, "Expected LCA for nodes 5 and 6 to be 5");
    }

    private LowestCommonAncestorOfABinaryTree.TreeNode createTree(Integer[] values, LowestCommonAncestorOfABinaryTree helper) {
        if (values == null || values.length == 0) {
            return null;
        }
        LowestCommonAncestorOfABinaryTree.TreeNode root = helper.new TreeNode(values[0]);
        Queue<LowestCommonAncestorOfABinaryTree.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            LowestCommonAncestorOfABinaryTree.TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = helper.new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = helper.new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    private LowestCommonAncestorOfABinaryTree.TreeNode findNode(LowestCommonAncestorOfABinaryTree.TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        LowestCommonAncestorOfABinaryTree.TreeNode left = findNode(root.left, val);
        return left != null ? left : findNode(root.right, val);
    }
}
