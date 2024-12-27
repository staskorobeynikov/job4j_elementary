package ru.job4j.algorithm.a75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {
    @Test
    void testMultipleElementsList() {
        ReverseLinkedList listHelper = new ReverseLinkedList();
        ReverseLinkedList.ListNode head = createList(new int[]{1, 2, 3, 4, 5}, listHelper);
        ReverseLinkedList.ListNode result = listHelper.reverseList(head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(result), "Expected reversed order [5, 4, 3, 2, 1]");
    }

    @Test
    void testSingleElementList() {
        ReverseLinkedList listHelper = new ReverseLinkedList();
        ReverseLinkedList.ListNode head = createList(new int[]{1}, listHelper);
        ReverseLinkedList.ListNode result = listHelper.reverseList(head);
        assertArrayEquals(new int[]{1}, toArray(result), "Single-element list should remain unchanged");
    }

    @Test
    void testEmptyList() {
        ReverseLinkedList listHelper = new ReverseLinkedList();
        ReverseLinkedList.ListNode result = listHelper.reverseList(null);
        assertNull(result, "Reversing an empty list should return null");
    }

    @Test
    void testTwoElementList() {
        ReverseLinkedList listHelper = new ReverseLinkedList();
        ReverseLinkedList.ListNode head = createList(new int[]{1, 2}, listHelper);
        ReverseLinkedList.ListNode result = listHelper.reverseList(head);
        assertArrayEquals(new int[]{2, 1}, toArray(result), "Expected reversed order [2, 1]");
    }

    private ReverseLinkedList.ListNode createList(int[] values, ReverseLinkedList helper) {
        ReverseLinkedList.ListNode dummy = helper.new ListNode();
        ReverseLinkedList.ListNode current = dummy;
        for (int value : values) {
            current.next = helper.new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(ReverseLinkedList.ListNode head) {
        if (head == null) return new int[0];
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}