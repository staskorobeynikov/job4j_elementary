package ru.job4j.algorithm.a75.dfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LongestZigZagPathInABinaryTreeTest {
    @Test
    void testSingleNodeTree() {
        LongestZigZagPathInABinaryTree treeHelper = new LongestZigZagPathInABinaryTree();
        LongestZigZagPathInABinaryTree.TreeNode root = treeHelper.new TreeNode(1);
        assertEquals(0, treeHelper.longestZigZag(root), "Single-node tree should have a ZigZag length of 0");
    }

    @Test
    void testSimpleZigZagTree() {
        LongestZigZagPathInABinaryTree treeHelper = new LongestZigZagPathInABinaryTree();
        LongestZigZagPathInABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2, null, treeHelper.new TreeNode(4)),
                treeHelper.new TreeNode(3));
        assertEquals(2, treeHelper.longestZigZag(root), "Expected longest ZigZag path length of 2");
    }

    @Test
    void testLeftSkewedTree() {
        LongestZigZagPathInABinaryTree treeHelper = new LongestZigZagPathInABinaryTree();
        LongestZigZagPathInABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2, treeHelper.new TreeNode(3, treeHelper.new TreeNode(4), null), null), null);
        assertEquals(1, treeHelper.longestZigZag(root), "Left-skewed tree should have a ZigZag length of 1");
    }

    @Test
    void testRightSkewedTree() {
        LongestZigZagPathInABinaryTree treeHelper = new LongestZigZagPathInABinaryTree();
        LongestZigZagPathInABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                null, treeHelper.new TreeNode(2, null, treeHelper.new TreeNode(3, null, treeHelper.new TreeNode(4))));
        assertEquals(1, treeHelper.longestZigZag(root), "Right-skewed tree should have a ZigZag length of 1");
    }

    @Test
    void testBalancedTree() {
        LongestZigZagPathInABinaryTree treeHelper = new LongestZigZagPathInABinaryTree();
        LongestZigZagPathInABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2, treeHelper.new TreeNode(4), treeHelper.new TreeNode(5)),
                treeHelper.new TreeNode(3, treeHelper.new TreeNode(6), treeHelper.new TreeNode(7)));
        assertEquals(2, treeHelper.longestZigZag(root), "Balanced tree should have a ZigZag length of 2");
    }

    @Test
    void testComplexTree() {
        LongestZigZagPathInABinaryTree treeHelper = new LongestZigZagPathInABinaryTree();
        LongestZigZagPathInABinaryTree.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(4,
                                null, treeHelper.new TreeNode(8)),
                        treeHelper.new TreeNode(5)),
                treeHelper.new TreeNode(3,
                        null, treeHelper.new TreeNode(6,
                        treeHelper.new TreeNode(9), null)));
        assertEquals(2, treeHelper.longestZigZag(root), "Expected longest ZigZag path length of 2");
    }
}
