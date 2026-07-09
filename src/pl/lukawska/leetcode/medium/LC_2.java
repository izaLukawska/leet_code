package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

//LINK: https://leetcode.com/problems/add-two-numbers/description/

public class LC_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode(0);
        ListNode result = sumNode;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int sum = v1 + v2 + carry;

            carry = sum / 10;
            sumNode.next = new ListNode(sum % 10);
            sumNode = sumNode.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry > 0) {
            sumNode.next = new ListNode(carry);
        }

        return result.next;
    }
}
