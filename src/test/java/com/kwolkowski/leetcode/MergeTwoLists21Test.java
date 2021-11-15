package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoLists21Test {
    @Test
    void t() {
        ListNode listNode = MergeTwoLists21.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(4))),
                new ListNode(1, new ListNode(3, new ListNode(4)))
        );

        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}