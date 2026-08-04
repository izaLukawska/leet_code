package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

public class LC_86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode leftPart = new ListNode(0);
        ListNode rightPart = new ListNode(0);

        ListNode left = leftPart;
        ListNode right = rightPart;

        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }

        right.next = null;
        left.next = rightPart.next;

        return leftPart.next;
    }
}
