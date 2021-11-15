package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

class MergeKSortedList23Test {

    @Test
    void testMergeLists() {
        ListNode listNode = MergeKSortedList23.mergeKLists(
                new ListNode[]{
                        new ListNode(1, new ListNode(4, new ListNode(5, null))),
                        new ListNode(1, new ListNode(3, new ListNode(4, null))),
                        new ListNode(2, new ListNode(6, null))
                }
        );
        while(listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

}