package com.kwolkowski.leetcode;

public class MergeKSortedList23 {
    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode prehead = new ListNode();
        ListNode current = prehead;

        while (true) {
            ListNode min = null;
            int minIndex = 0;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) continue;
                if (min == null) {
                    min = lists[i];
                    minIndex = i;
                }
                if (lists[i].val < min.val) {
                    min = lists[i];
                    minIndex = i;
                }
            }
            if (min != null) {
                current.next = min;
                current = current.next;
                lists[minIndex] = lists[minIndex].next;
            } else {
                break;
            }
        }
        return prehead.next;
    }
}

//class ListNode {
//    int val;
//    ListNode2 next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode2 next) {
//        this.val = val;
//        this.next = next;
//    }
//}
