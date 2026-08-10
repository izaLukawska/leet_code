package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

public class LC_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
