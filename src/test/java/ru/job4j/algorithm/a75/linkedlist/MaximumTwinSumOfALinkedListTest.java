package ru.job4j.algorithm.a75.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaximumTwinSumOfALinkedListTest {
    @Test
    void testEvenLengthList() {
        MaximumTwinSumOfALinkedList listHelper = new MaximumTwinSumOfALinkedList();
        MaximumTwinSumOfALinkedList.ListNode head = createList(new int[]{1, 2, 3, 4}, listHelper);
        int result = listHelper.pairSum(head);
        assertEquals(5, result, "Expected twin sum is 5 for list [1, 2, 3, 4]");
    }

    @Test
    void testAnotherEvenLengthList() {
        MaximumTwinSumOfALinkedList listHelper = new MaximumTwinSumOfALinkedList();
        MaximumTwinSumOfALinkedList.ListNode head = createList(new int[]{4, 2, 2, 4}, listHelper);
        int result = listHelper.pairSum(head);
        assertEquals(8, result, "Expected twin sum is 8 for list [4, 2, 2, 4]");
    }

    @Test
    void testSinglePairList() {
        MaximumTwinSumOfALinkedList listHelper = new MaximumTwinSumOfALinkedList();
        MaximumTwinSumOfALinkedList.ListNode head = createList(new int[]{1, 100}, listHelper);
        int result = listHelper.pairSum(head);
        assertEquals(101, result, "Expected twin sum is 101 for list [1, 100]");
    }

    @Test
    void testLargeValuesList() {
        MaximumTwinSumOfALinkedList listHelper = new MaximumTwinSumOfALinkedList();
        MaximumTwinSumOfALinkedList.ListNode head = createList(new int[]{1000, 2000, 3000, 4000}, listHelper);
        int result = listHelper.pairSum(head);
        assertEquals(5000, result, "Expected twin sum is 5000 for list [1000, 2000, 3000, 4000]");
    }

    @Test
    void testAllSameValues() {
        MaximumTwinSumOfALinkedList listHelper = new MaximumTwinSumOfALinkedList();
        MaximumTwinSumOfALinkedList.ListNode head = createList(new int[]{5, 5, 5, 5}, listHelper);
        int result = listHelper.pairSum(head);
        assertEquals(10, result, "Expected twin sum is 10 for list [5, 5, 5, 5]");
    }

    private MaximumTwinSumOfALinkedList.ListNode createList(int[] values, MaximumTwinSumOfALinkedList helper) {
        MaximumTwinSumOfALinkedList.ListNode dummy = helper.new ListNode();
        MaximumTwinSumOfALinkedList.ListNode current = dummy;
        for (int value : values) {
            current.next = helper.new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
}
