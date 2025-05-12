package ru.job4j.algorithm.a75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {
    @Test
    void testOddLengthList() {
        OddEvenLinkedList listHelper = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = createList(new int[]{1, 2, 3, 4, 5}, listHelper);
        OddEvenLinkedList.ListNode result = listHelper.oddEvenList(head);
        assertArrayEquals(new int[]{1, 3, 5, 2, 4}, toArray(result), "Expected order is [1, 3, 5, 2, 4]");
    }

    @Test
    void testEvenLengthList() {
        OddEvenLinkedList listHelper = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = createList(new int[]{1, 2, 3, 4, 5, 6}, listHelper);
        OddEvenLinkedList.ListNode result = listHelper.oddEvenList(head);
        assertArrayEquals(new int[]{1, 3, 5, 2, 4, 6}, toArray(result), "Expected order is [1, 3, 5, 2, 4, 6]");
    }

    @Test
    void testSingleNodeList() {
        OddEvenLinkedList listHelper = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = createList(new int[]{1}, listHelper);
        OddEvenLinkedList.ListNode result = listHelper.oddEvenList(head);
        assertArrayEquals(new int[]{1}, toArray(result), "Single-node list remains unchanged");
    }

    @Test
    void testTwoNodeList() {
        OddEvenLinkedList listHelper = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = createList(new int[]{1, 2}, listHelper);
        OddEvenLinkedList.ListNode result = listHelper.oddEvenList(head);
        assertArrayEquals(new int[]{1, 2}, toArray(result), "Two-node list remains unchanged");
    }

    @Test
    void testEmptyList() {
        OddEvenLinkedList listHelper = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode result = listHelper.oddEvenList(null);
        assertNull(result, "Empty list should return null");
    }

    @Test
    void testAllEvenValues() {
        OddEvenLinkedList listHelper = new OddEvenLinkedList();
        OddEvenLinkedList.ListNode head = createList(new int[]{2, 4, 6, 8}, listHelper);
        OddEvenLinkedList.ListNode result = listHelper.oddEvenList(head);
        assertArrayEquals(new int[]{2, 6, 4, 8}, toArray(result), "Odd-indexed and even-indexed values should rearrange correctly");
    }

    private OddEvenLinkedList.ListNode createList(int[] values, OddEvenLinkedList helper) {
        OddEvenLinkedList.ListNode dummy = helper.new ListNode();
        OddEvenLinkedList.ListNode current = dummy;
        for (int value : values) {
            current.next = helper.new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    private int[] toArray(OddEvenLinkedList.ListNode head) {
        if (head == null) {
            return new int[0];
        }
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}