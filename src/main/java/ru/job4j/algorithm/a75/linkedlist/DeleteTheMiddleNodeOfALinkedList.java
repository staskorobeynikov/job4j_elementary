package ru.job4j.algorithm.a75.linkedlist;

public class DeleteTheMiddleNodeOfALinkedList {
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

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow.next == null) {
            head.next = null;
            return head;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        return head;
    }
}
