package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

//https://leetcode.com/problems/swap-nodes-in-pairs/
public class LC_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode current = result;

        while(current.next != null && current.next.next != null){
            ListNode swap1 = current.next;
            ListNode swap2 = current.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;

            current.next = swap2;
            current = swap2.next;
        }

        return result.next;
    }
}
