package pl.lukawska.leetcode.easy;

import pl.lukawska.leetcode.ListNode;

//LINK: https://leetcode.com/problems/merge-two-sorted-lists/
public class LC_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode current = result;

        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.val <= list2.val)) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            current = current.next;
        }

        return result.next;
    }
}
