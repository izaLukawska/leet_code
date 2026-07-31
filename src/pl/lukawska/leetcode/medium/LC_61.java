package pl.lukawska.leetcode.medium;

import pl.lukawska.leetcode.ListNode;

//https://leetcode.com/problems/rotate-list/description/
public class LC_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }

        ListNode current = head;
        int len = 1;

        while(current.next != null) {
            current = current.next;
            len++;
        }

        current.next = head;
        ListNode newTail = head;

        for(int i = 0; i < len - (k % len) - 1; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
