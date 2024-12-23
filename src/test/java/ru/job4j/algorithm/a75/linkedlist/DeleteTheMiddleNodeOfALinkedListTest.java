package ru.job4j.algorithm.a75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeleteTheMiddleNodeOfALinkedListTest {

    @Test
    void testDeleteMiddleInOddLengthList() {
        DeleteTheMiddleNodeOfALinkedList listHelper = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = createList(new int[]{1, 2, 3, 4, 5}, listHelper);
        DeleteTheMiddleNodeOfALinkedList.ListNode result = listHelper.deleteMiddle(head);
        assertArrayEquals(new int[]{1, 2, 4, 5}, toArray(result), "Expected [1, 2, 4, 5] after deleting the middle node");
    }

    @Test
    void testDeleteMiddleInEvenLengthList() {
        DeleteTheMiddleNodeOfALinkedList listHelper = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = createList(new int[]{1, 2, 3, 4}, listHelper);
        DeleteTheMiddleNodeOfALinkedList.ListNode result = listHelper.deleteMiddle(head);
        assertArrayEquals(new int[]{1, 2, 4}, toArray(result), "Expected [1, 2, 4] after deleting the middle node");
    }

    @Test
    void testSingleNodeList() {
        DeleteTheMiddleNodeOfALinkedList listHelper = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = createList(new int[]{1}, listHelper);
        DeleteTheMiddleNodeOfALinkedList.ListNode result = listHelper.deleteMiddle(head);
        assertNull(result, "Expected null for a single-node list after deleting the middle node");
    }

    @Test
    void testTwoNodeList() {
        DeleteTheMiddleNodeOfALinkedList listHelper = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode head = createList(new int[]{1, 2}, listHelper);
        DeleteTheMiddleNodeOfALinkedList.ListNode result = listHelper.deleteMiddle(head);
        assertArrayEquals(new int[]{1}, toArray(result), "Expected [1] after deleting the middle node from a two-node list");
    }

    @Test
    void testNullList() {
        DeleteTheMiddleNodeOfALinkedList listHelper = new DeleteTheMiddleNodeOfALinkedList();
        DeleteTheMiddleNodeOfALinkedList.ListNode result = listHelper.deleteMiddle(null);
        assertNull(result, "Expected null for a null input list");
    }

    private DeleteTheMiddleNodeOfALinkedList.ListNode createList(int[] values, DeleteTheMiddleNodeOfALinkedList helper) {
        DeleteTheMiddleNodeOfALinkedList.ListNode dummy = helper.new ListNode();
        DeleteTheMiddleNodeOfALinkedList.ListNode current = dummy;
        for (int value : values) {
            current.next = helper.new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(DeleteTheMiddleNodeOfALinkedList.ListNode head) {
        if (head == null) return new int[0];
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
