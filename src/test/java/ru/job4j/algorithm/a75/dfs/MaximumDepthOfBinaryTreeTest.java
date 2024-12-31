package ru.job4j.algorithm.a75.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumDepthOfBinaryTreeTest {
    @Test
    void testEmptyTree() {
        MaximumDepthOfBinaryTree treeHelper = new MaximumDepthOfBinaryTree();
        assertEquals(0, treeHelper.maxDepth(null), "The depth of an empty tree should be 0");
    }

    @Test
    void testSingleNodeTree() {
        MaximumDepthOfBinaryTree treeHelper = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = treeHelper.new TreeNode(1);
        assertEquals(1, treeHelper.maxDepth(root), "The depth of a tree with only one node should be 1");
    }

    @Test
    void testLeftSkewedTree() {
        MaximumDepthOfBinaryTree treeHelper = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(3, null, null), null), null);
        assertEquals(3, treeHelper.maxDepth(root), "The depth of a left-skewed tree should be equal to its height");
    }

    @Test
    void testRightSkewedTree() {
        MaximumDepthOfBinaryTree treeHelper = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                null, treeHelper.new TreeNode(2,
                null, treeHelper.new TreeNode(3, null, null)));
        assertEquals(3, treeHelper.maxDepth(root), "The depth of a right-skewed tree should be equal to its height");
    }

    @Test
    void testBalancedTree() {
        MaximumDepthOfBinaryTree treeHelper = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(4, null, null),
                        treeHelper.new TreeNode(5, null, null)),
                treeHelper.new TreeNode(3,
                        null, null));
        assertEquals(3, treeHelper.maxDepth(root), "The depth of a balanced tree with height 3 should be 3");
    }

    @Test
    void testUnbalancedTree() {
        MaximumDepthOfBinaryTree treeHelper = new MaximumDepthOfBinaryTree();
        MaximumDepthOfBinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(3,
                                treeHelper.new TreeNode(4, null, null), null), null),
                treeHelper.new TreeNode(5, null, null));
        assertEquals(4, treeHelper.maxDepth(root), "The depth of the unbalanced tree should be the maximum depth");
    }
}