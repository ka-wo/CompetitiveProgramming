package com.kwolkowski.leetcode;

public class ReverseNodesInK25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;

        ListNode preHead = new ListNode(0, head);
        int countAll = 0;
        while (head != null) {
            countAll++;
            head = head.next;
        }
        head = preHead.next;
        ListNode preFirst = preHead;
        for (int i = 0; i < countAll / k; i++) {
            ListNode afterLast = null;
            int count = k;
            while (head != null && count > 0) {
                count--;
                head = head.next;
                afterLast = head;
            }

            ListNode first = preFirst.next;
            ListNode previous = first;
            ListNode curr = first.next;
            while (curr != afterLast) {
                ListNode temp = curr.next;
                curr.next = previous;
                previous = curr;
                curr = temp;
            }
            first.next = afterLast;
            preFirst.next = previous;
            preFirst = first;

        }
        return preHead.next;
    }
}
