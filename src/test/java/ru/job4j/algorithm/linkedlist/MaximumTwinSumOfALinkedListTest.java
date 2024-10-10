package ru.job4j.algorithm.linkedlist;

import org.junit.jupiter.api.Test;
import ru.job4j.algorithm.linkedlist.MaximumTwinSumOfALinkedList.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTwinSumOfALinkedListTest {
    @Test
    void testPairSumEvenNumberOfNodes() {
        MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

        ListNode node4 = solution.new ListNode(4);
        ListNode node3 = solution.new ListNode(2, node4);
        ListNode node2 = solution.new ListNode(2, node3);
        ListNode node1 = solution.new ListNode(1, node2);

        int result = solution.pairSum(node1);
        assertEquals(5, result);
    }

    @Test
    void testPairSumAllEqualNodes() {
        MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

        ListNode node4 = solution.new ListNode(1);
        ListNode node3 = solution.new ListNode(1, node4);
        ListNode node2 = solution.new ListNode(1, node3);
        ListNode node1 = solution.new ListNode(1, node2);

        int result = solution.pairSum(node1);
        assertEquals(2, result, "The maximum twin sum of the linked list is 2");
    }

    @Test
    void testPairSumFourNodes() {
        MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

        ListNode node4 = solution.new ListNode(10);
        ListNode node3 = solution.new ListNode(20, node4);
        ListNode node2 = solution.new ListNode(5, node3);
        ListNode node1 = solution.new ListNode(15, node2);

        int result = solution.pairSum(node1);
        assertEquals(25, result);
    }

    @Test
    void testPairSumTwoNodes() {
        MaximumTwinSumOfALinkedList solution = new MaximumTwinSumOfALinkedList();

        ListNode node2 = solution.new ListNode(10);
        ListNode node1 = solution.new ListNode(5, node2);

        int result = solution.pairSum(node1);
        assertEquals(15, result, "The twin sum of a two-node linked list is the sum of both node values");
    }
}