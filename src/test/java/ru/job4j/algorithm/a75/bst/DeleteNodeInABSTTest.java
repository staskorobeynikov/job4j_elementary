package ru.job4j.algorithm.a75.bst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class DeleteNodeInABSTTest {
    @Test
    void testDeleteLeafNode() {
        DeleteNodeInABST treeHelper = new DeleteNodeInABST();
        DeleteNodeInABST.TreeNode root = createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}, treeHelper);
        DeleteNodeInABST.TreeNode result = treeHelper.deleteNode(root, 4);
        assertEquals(List.of(2, 3, 5, 6, 7), toList(result), "Leaf node 4 should be deleted");
    }

    @Test
    void testDeleteNodeWithOneChild() {
        DeleteNodeInABST treeHelper = new DeleteNodeInABST();
        DeleteNodeInABST.TreeNode root = createTree(new Integer[]{5, 3, 6, 2, null, null, 7}, treeHelper);
        DeleteNodeInABST.TreeNode result = treeHelper.deleteNode(root, 3);
        assertEquals(List.of(2, 5, 6, 7), toList(result), "Node 3 with one child should be deleted");
    }

    @Test
    void testDeleteNodeWithTwoChildren() {
        DeleteNodeInABST treeHelper = new DeleteNodeInABST();
        DeleteNodeInABST.TreeNode root = createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}, treeHelper);
        DeleteNodeInABST.TreeNode result = treeHelper.deleteNode(root, 5);
        assertEquals(List.of(2, 3, 4, 6, 7), toList(result), "Node 5 with two children should be deleted");
    }

    @Test
    void testDeleteRootNode() {
        DeleteNodeInABST treeHelper = new DeleteNodeInABST();
        DeleteNodeInABST.TreeNode root = createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}, treeHelper);
        DeleteNodeInABST.TreeNode result = treeHelper.deleteNode(root, 5);
        assertEquals(List.of(2, 3, 4, 6, 7), toList(result), "Root node 5 should be deleted");
    }

    @Test
    void testDeleteNonExistentNode() {
        DeleteNodeInABST treeHelper = new DeleteNodeInABST();
        DeleteNodeInABST.TreeNode root = createTree(new Integer[]{5, 3, 6, 2, 4, null, 7}, treeHelper);
        DeleteNodeInABST.TreeNode result = treeHelper.deleteNode(root, 8);
        assertEquals(List.of(2, 3, 4, 5, 6, 7), toList(result), "Tree should remain unchanged as node 8 does not exist");
    }

    @Test
    void testDeleteFromEmptyTree() {
        DeleteNodeInABST treeHelper = new DeleteNodeInABST();
        DeleteNodeInABST.TreeNode result = treeHelper.deleteNode(null, 1);
        assertNull(result, "Deleting from an empty tree should return null");
    }

    private DeleteNodeInABST.TreeNode createTree(Integer[] values, DeleteNodeInABST helper) {
        if (values == null || values.length == 0) {
            return null;
        }
        DeleteNodeInABST.TreeNode root = helper.new TreeNode(values[0]);
        Queue<DeleteNodeInABST.TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            DeleteNodeInABST.TreeNode current = queue.poll();
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

    private List<Integer> toList(DeleteNodeInABST.TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(DeleteNodeInABST.TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, result);
        result.add(node.val);
        inorderTraversal(node.right, result);
    }
}
