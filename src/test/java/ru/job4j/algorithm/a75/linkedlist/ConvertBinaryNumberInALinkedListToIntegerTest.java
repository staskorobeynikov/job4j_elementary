package ru.job4j.algorithm.a75.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryNumberInALinkedListToIntegerTest {

    @Test
    void testSingleZeroNode() {
        ConvertBinaryNumberInALinkedListToInteger solver = new ConvertBinaryNumberInALinkedListToInteger();
        ConvertBinaryNumberInALinkedListToInteger.ListNode head = solver.new ListNode(0);
        assertEquals(0, solver.getDecimalValue(head));
    }

    @Test
    void testSingleOneNode() {
        ConvertBinaryNumberInALinkedListToInteger solver = new ConvertBinaryNumberInALinkedListToInteger();
        ConvertBinaryNumberInALinkedListToInteger.ListNode head = solver.new ListNode(1);
        assertEquals(1, solver.getDecimalValue(head));
    }

    @Test
    void testBinaryOneZero() {
        ConvertBinaryNumberInALinkedListToInteger solver = new ConvertBinaryNumberInALinkedListToInteger();
        ConvertBinaryNumberInALinkedListToInteger.ListNode head =
                solver.new ListNode(1, solver.new ListNode(0));
        assertEquals(2, solver.getDecimalValue(head));
    }

    @Test
    void testBinaryOneZeroOne() {
        ConvertBinaryNumberInALinkedListToInteger solver = new ConvertBinaryNumberInALinkedListToInteger();
        ConvertBinaryNumberInALinkedListToInteger.ListNode head =
                solver.new ListNode(1,
                        solver.new ListNode(0,
                                solver.new ListNode(1)));
        assertEquals(5, solver.getDecimalValue(head));
    }

    @Test
    void testAllOnes() {
        ConvertBinaryNumberInALinkedListToInteger solver = new ConvertBinaryNumberInALinkedListToInteger();
        ConvertBinaryNumberInALinkedListToInteger.ListNode head =
                solver.new ListNode(1,
                        solver.new ListNode(1,
                                solver.new ListNode(1,
                                        solver.new ListNode(1))));
        assertEquals(15, solver.getDecimalValue(head));
    }

    @Test
    void testAllZerosThenOne() {
        ConvertBinaryNumberInALinkedListToInteger solver = new ConvertBinaryNumberInALinkedListToInteger();
        ConvertBinaryNumberInALinkedListToInteger.ListNode head =
                solver.new ListNode(0,
                        solver.new ListNode(0,
                                solver.new ListNode(0,
                                        solver.new ListNode(1))));
        assertEquals(1, solver.getDecimalValue(head));
    }
}
