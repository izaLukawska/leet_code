package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

public class LC_82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = new ListNode(0);
        result.next = head;

        ListNode prev = result;
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                prev.next = curr.next;
            } else {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return result.next;
    }
}
