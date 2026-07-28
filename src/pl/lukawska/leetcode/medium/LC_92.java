package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

//https://leetcode.com/problems/reverse-linked-list-ii/
public class LC_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode beforeLeft = dummy;

        for (int i = 1; i < left; i++) {
            beforeLeft = beforeLeft.next;
        }

        ListNode leftNode = beforeLeft.next;
        ListNode prev = null;
        ListNode curr = leftNode;

        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        beforeLeft.next = prev;
        leftNode.next = curr;

        return dummy.next;
    }
}
