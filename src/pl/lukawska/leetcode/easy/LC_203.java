package pl.lukawska.leetcode.easy;

import pl.lukawska.leetcode.ListNode;

public class LC_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode();
        result.next = head;

        ListNode dummy = result;

        while (dummy.next != null) {
            if (dummy.next.val == val) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }

        return result.next;
    }
}
