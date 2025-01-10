package ru.job4j.algorithm.a75.bfs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BinaryTreeRightSideViewTest {
    @Test
    void testEmptyTree() {
        BinaryTreeRightSideView treeHelper = new BinaryTreeRightSideView();
        assertTrue(treeHelper.rightSideView(null).isEmpty(), "Expected empty list for empty tree");
    }

    @Test
    void testSingleNodeTree() {
        BinaryTreeRightSideView treeHelper = new BinaryTreeRightSideView();
        BinaryTreeRightSideView.TreeNode root = treeHelper.new TreeNode(1);
        assertEquals(List.of(1), treeHelper.rightSideView(root), "Expected [1] for single-node tree");
    }

    @Test
    void testRightSkewedTree() {
        BinaryTreeRightSideView treeHelper = new BinaryTreeRightSideView();
        BinaryTreeRightSideView.TreeNode root = treeHelper.new TreeNode(1,
                null, treeHelper.new TreeNode(2,
                null, treeHelper.new TreeNode(3)));
        assertEquals(List.of(1, 2, 3), treeHelper.rightSideView(root), "Expected [1, 2, 3] for right-skewed tree");
    }

    @Test
    void testLeftSkewedTree() {
        BinaryTreeRightSideView treeHelper = new BinaryTreeRightSideView();
        BinaryTreeRightSideView.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(3), null), null);
        assertEquals(List.of(1, 2, 3), treeHelper.rightSideView(root), "Expected [1, 2, 3] for left-skewed tree");
    }

    @Test
    void testBalancedTree() {
        BinaryTreeRightSideView treeHelper = new BinaryTreeRightSideView();
        BinaryTreeRightSideView.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        treeHelper.new TreeNode(4), null),
                treeHelper.new TreeNode(3,
                        null, treeHelper.new TreeNode(5)));
        assertEquals(List.of(1, 3, 5), treeHelper.rightSideView(root), "Expected [1, 3, 5] for balanced tree");
    }

    @Test
    void testComplexTree() {
        BinaryTreeRightSideView treeHelper = new BinaryTreeRightSideView();
        BinaryTreeRightSideView.TreeNode root = treeHelper.new TreeNode(1,
                treeHelper.new TreeNode(2,
                        null, treeHelper.new TreeNode(4)),
                treeHelper.new TreeNode(3,
                        null, treeHelper.new TreeNode(5,
                        treeHelper.new TreeNode(6), null)));
        assertEquals(List.of(1, 3, 5, 6), treeHelper.rightSideView(root), "Expected [1, 3, 5, 6] for complex tree");
    }
}
