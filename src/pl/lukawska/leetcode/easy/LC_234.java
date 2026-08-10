package pl.lukawska.leetcode.easy;

import pl.lukawska.leetcode.ListNode;

public class LC_234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        ListNode reversed = reverseList(slow);

        while (reversed != null) {
            if (reversed.val != head.val) {
                return false;
            }

            reversed = reversed.next;
            head = head.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode listNode) {
        ListNode prev = null;
        ListNode curr = listNode;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
