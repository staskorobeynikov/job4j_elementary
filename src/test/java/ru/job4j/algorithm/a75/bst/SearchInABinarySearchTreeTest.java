package ru.job4j.algorithm.a75.bst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInABinarySearchTreeTest {
    @Test
    void testSearchRootNode() {
        SearchInABinarySearchTree treeHelper = new SearchInABinarySearchTree();
        SearchInABinarySearchTree.TreeNode root = createTree(new Integer[]{4, 2, 7, 1, 3}, treeHelper);
        SearchInABinarySearchTree.TreeNode result = treeHelper.searchBST(root, 4);
        assertNotNull(result, "Root node should be found");
        assertEquals(4, result.val, "Expected value 4 at the root");
    }

    @Test
    void testSearchExistingValue() {
        SearchInABinarySearchTree treeHelper = new SearchInABinarySearchTree();
        SearchInABinarySearchTree.TreeNode root = createTree(new Integer[]{4, 2, 7, 1, 3}, treeHelper);
        SearchInABinarySearchTree.TreeNode result = treeHelper.searchBST(root, 2);
        assertNotNull(result, "Node with value 2 should be found");
        assertEquals(2, result.val, "Expected value 2 in the tree");
    }

    @Test
    void testSearchNonExistingValue() {
        SearchInABinarySearchTree treeHelper = new SearchInABinarySearchTree();
        SearchInABinarySearchTree.TreeNode root = createTree(new Integer[]{4, 2, 7, 1, 3}, treeHelper);
        SearchInABinarySearchTree.TreeNode result = treeHelper.searchBST(root, 5);
        assertNull(result, "Node with value 5 should not be found");
    }

    @Test
    void testSearchLeafNode() {
        SearchInABinarySearchTree treeHelper = new SearchInABinarySearchTree();
        SearchInABinarySearchTree.TreeNode root = createTree(new Integer[]{4, 2, 7, 1, 3}, treeHelper);
        SearchInABinarySearchTree.TreeNode result = treeHelper.searchBST(root, 3);
        assertNotNull(result, "Leaf node with value 3 should be found");
        assertEquals(3, result.val, "Expected value 3 for the leaf node");
    }

    @Test
    void testEmptyTree() {
        SearchInABinarySearchTree treeHelper = new SearchInABinarySearchTree();
        SearchInABinarySearchTree.TreeNode result = treeHelper.searchBST(null, 1);
        assertNull(result, "Search in an empty tree should return null");
    }

    private SearchInABinarySearchTree.TreeNode createTree(Integer[] values, SearchInABinarySearchTree helper) {
        if (values == null || values.length == 0) {
            return null;
        }
        SearchInABinarySearchTree.TreeNode root = helper.new TreeNode(values[0]);
        Queue<SearchInABinarySearchTree.TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            SearchInABinarySearchTree.TreeNode current = queue.poll();
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
