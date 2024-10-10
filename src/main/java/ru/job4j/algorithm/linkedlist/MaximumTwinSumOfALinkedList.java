package ru.job4j.algorithm.linkedlist;

public class MaximumTwinSumOfALinkedList {
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

    public int pairSum(ListNode head) {
        ListNode middle = middleNode(head);
        ListNode reversed = reverseList(middle);
        ListNode left = head;
        ListNode right = reversed;
        int result = Integer.MIN_VALUE;
        while (right != null) {
            result = Math.max(result, left.val + right.val);
            left = left.next;
            right = right.next;
        }
        return result;
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

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
