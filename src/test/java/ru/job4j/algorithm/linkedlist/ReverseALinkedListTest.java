package ru.job4j.algorithm.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.job4j.algorithm.linkedlist.ReverseALinkedList.*;

class ReverseALinkedListTest {
    @Test
    void testReverseListMultipleNodes() {
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();

        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode result = reverseALinkedList.reverseList(node1);

        assertEquals(3, result.val);
        assertEquals(2, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    void testReverseListSingleNode() {
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();

        ListNode node = new ListNode(1);

        ListNode result = reverseALinkedList.reverseList(node);

        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    void testReverseListEmpty() {
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();

        ListNode result = reverseALinkedList.reverseList(null);

        assertNull(result, "Reversing an empty list should return null");
    }

    @Test
    void testReverseListTwoNodes() {
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();

        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);

        ListNode result = reverseALinkedList.reverseList(node1);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }
}