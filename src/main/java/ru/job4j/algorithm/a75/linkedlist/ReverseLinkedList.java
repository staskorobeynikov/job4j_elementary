package ru.job4j.algorithm.a75.linkedlist;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current;
            current = current.next;
            temp.next = previous;
            previous = temp;
        }
        return previous;
    }
}
