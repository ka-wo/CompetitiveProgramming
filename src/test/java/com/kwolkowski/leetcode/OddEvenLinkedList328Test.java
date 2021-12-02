package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedList328Test {

    @Test
    void t() {
        ListNode listNode = OddEvenLinkedList328.oddEvenList(new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)
                                )))));
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    void t2() {
        ListNode l = OddEvenLinkedList328.oddEvenList(
                new ListNode(1,
                new ListNode(2,
                new ListNode(3,
                new ListNode(4,
                new ListNode(5,
                new ListNode(6,
                new ListNode(7,
                new ListNode(8)))))))));
        while(l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

}