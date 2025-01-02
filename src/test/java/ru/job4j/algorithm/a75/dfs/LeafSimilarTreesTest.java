package ru.job4j.algorithm.a75.dfs;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeafSimilarTreesTest {
    @Test
    void testSimilarLeafTrees() {
        LeafSimilarTrees treeHelper = new LeafSimilarTrees();

        LeafSimilarTrees.TreeNode root1 = createTree(new Integer[]{1, 2, 3}, treeHelper);
        LeafSimilarTrees.TreeNode root2 = createTree(new Integer[]{1, 2, 3}, treeHelper);

        assertTrue(treeHelper.leafSimilar(root1, root2), "Both trees have the same leaf sequence");
    }

    @Test
    void testDifferentLeafTrees() {
        LeafSimilarTrees treeHelper = new LeafSimilarTrees();

        LeafSimilarTrees.TreeNode root1 = createTree(new Integer[]{1, 2, 3}, treeHelper);
        LeafSimilarTrees.TreeNode root2 = createTree(new Integer[]{1, null, 2}, treeHelper);

        assertFalse(treeHelper.leafSimilar(root1, root2), "Trees have different leaf sequences");
    }

    @Test
    void testSingleNodeTreesSimilar() {
        LeafSimilarTrees treeHelper = new LeafSimilarTrees();

        LeafSimilarTrees.TreeNode root1 = treeHelper.new TreeNode(1);
        LeafSimilarTrees.TreeNode root2 = treeHelper.new TreeNode(1);

        assertTrue(treeHelper.leafSimilar(root1, root2), "Single-node trees with the same value are similar");
    }

    @Test
    void testSingleNodeTreesDifferent() {
        LeafSimilarTrees treeHelper = new LeafSimilarTrees();

        LeafSimilarTrees.TreeNode root1 = treeHelper.new TreeNode(1);
        LeafSimilarTrees.TreeNode root2 = treeHelper.new TreeNode(2);

        assertFalse(treeHelper.leafSimilar(root1, root2), "Single-node trees with different values are not similar");
    }

    @Test
    void testEmptyTrees() {
        LeafSimilarTrees treeHelper = new LeafSimilarTrees();

        assertTrue(treeHelper.leafSimilar(null, null), "Two empty trees are similar");
    }

    @Test
    void testOneEmptyTree() {
        LeafSimilarTrees treeHelper = new LeafSimilarTrees();

        LeafSimilarTrees.TreeNode root1 = createTree(new Integer[]{1, 2, 3}, treeHelper);

        assertFalse(treeHelper.leafSimilar(root1, null), "Non-empty tree and empty tree are not similar");
    }

    private LeafSimilarTrees.TreeNode createTree(Integer[] values, LeafSimilarTrees helper) {
        if (values == null || values.length == 0) {
            return null;
        }

        LeafSimilarTrees.TreeNode root = helper.new TreeNode(values[0]);
        Queue<LeafSimilarTrees.TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            LeafSimilarTrees.TreeNode current = queue.poll();
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
}
