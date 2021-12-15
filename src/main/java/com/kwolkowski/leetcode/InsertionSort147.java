package com.kwolkowski.leetcode;

public class InsertionSort147 {
    public static ListNode insertionSortList(ListNode head) {
        ListNode preHead = new ListNode(-6000, head);
        ListNode curr = head.next;

        while(curr != null) {
            if(curr.val < head.val) {
                ListNode iter = preHead;
                while(iter.next != null) {
                    if (iter.val < curr.val && iter.next.val >= curr.val) {
                        head.next = curr.next;
                        curr.next = iter.next;
                        iter.next = curr;
                        break;
                    }
                    iter = iter.next;
                }
            } else {
                head = head.next;
            }
            curr = head.next;
        }
        return preHead.next;
    }
}
