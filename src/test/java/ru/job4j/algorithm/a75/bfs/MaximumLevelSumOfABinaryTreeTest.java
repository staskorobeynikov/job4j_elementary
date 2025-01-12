package ru.job4j.algorithm.a75.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLevelSumOfABinaryTreeTest {
    @Test
    void testSingleNodeTree() {
        MaximumLevelSumOfABinaryTree treeHelper = new MaximumLevelSumOfABinaryTree();
        MaximumLevelSumOfABinaryTree.TreeNode root = treeHelper.new TreeNode(1);
        assertEquals(1, treeHelper.maxLevelSum(root), "Single-node tree should have level 1 as the max sum level");
    }

    @Test
    void testBalancedTree() {
        MaximumLevelSumOfABinaryTree treeHelper = new MaximumLevelSumOfABinaryTree();
        MaximumLevelSumOfABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(7, treeHelper.new TreeNode(7), treeHelper.new TreeNode(-8)),
                treeHelper.new TreeNode(0));
        assertEquals(2, treeHelper.maxLevelSum(root), "Expected level 2 to have the maximum sum");
    }

    @Test
    void testSkewedLeftTree() {
        MaximumLevelSumOfABinaryTree treeHelper = new MaximumLevelSumOfABinaryTree();
        MaximumLevelSumOfABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(3,
                                treeHelper.new TreeNode(4), null), null), null);
        assertEquals(4, treeHelper.maxLevelSum(root), "Expected level 4 to have the maximum sum");
    }

    @Test
    void testSkewedRightTree() {
        MaximumLevelSumOfABinaryTree treeHelper = new MaximumLevelSumOfABinaryTree();
        MaximumLevelSumOfABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                null, treeHelper.new TreeNode(2,
                null, treeHelper.new TreeNode(3,
                null, treeHelper.new TreeNode(4))));
        assertEquals(4, treeHelper.maxLevelSum(root), "Expected level 4 to have the maximum sum");
    }

    @Test
    void testComplexTree() {
        MaximumLevelSumOfABinaryTree treeHelper = new MaximumLevelSumOfABinaryTree();
        MaximumLevelSumOfABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(4, null, treeHelper.new TreeNode(7)),
                        treeHelper.new TreeNode(5)),
                treeHelper.new TreeNode(3,
                        null, treeHelper.new TreeNode(6, treeHelper.new TreeNode(8), null)));
        assertEquals(3, treeHelper.maxLevelSum(root), "Expected level 3 to have the maximum sum");
    }

    @Test
    void testNegativeValuesTree() {
        MaximumLevelSumOfABinaryTree treeHelper = new MaximumLevelSumOfABinaryTree();
        MaximumLevelSumOfABinaryTree.TreeNode root = treeHelper.new TreeNode(-1,
                treeHelper.new TreeNode(-2, treeHelper.new TreeNode(-4), treeHelper.new TreeNode(-5)),
                treeHelper.new TreeNode(-3, null, treeHelper.new TreeNode(-6)));
        assertEquals(1, treeHelper.maxLevelSum(root), "Expected level 1 to have the maximum sum in a tree with all negative values");
    }
}
