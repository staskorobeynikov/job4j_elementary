package ru.job4j.algorithm.a75.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountGoodNodesInBinaryTreeTest {

    @Test
    void testSingleNodeTree() {
        CountGoodNodesInBinaryTree treeHelper = new CountGoodNodesInBinaryTree();
        CountGoodNodesInBinaryTree.TreeNode root = treeHelper.new TreeNode(1);
        assertEquals(1, treeHelper.goodNodes(root), "Single-node tree should have 1 good node");
    }

    @Test
    void testLeftSkewedTree() {
        CountGoodNodesInBinaryTree treeHelper = new CountGoodNodesInBinaryTree();
        CountGoodNodesInBinaryTree.TreeNode root = treeHelper.new TreeNode(3,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(1), null), null);
        assertEquals(1, treeHelper.goodNodes(root), "Only the root node is good in this left-skewed tree");
    }

    @Test
    void testRightSkewedTree() {
        CountGoodNodesInBinaryTree treeHelper = new CountGoodNodesInBinaryTree();
        CountGoodNodesInBinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                null, treeHelper.new TreeNode(2,
                null, treeHelper.new TreeNode(3)));
        assertEquals(3, treeHelper.goodNodes(root), "All nodes are good in this right-skewed tree");
    }

    @Test
    void testEmptyTree() {
        CountGoodNodesInBinaryTree treeHelper = new CountGoodNodesInBinaryTree();
        assertEquals(0, treeHelper.goodNodes(null), "Empty tree should have 0 good nodes");
    }
}
