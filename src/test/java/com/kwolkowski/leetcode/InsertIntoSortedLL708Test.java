package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntoSortedLL708Test {

    @Test
    void t() {
        InsertIntoSortedLL708.Node last = new InsertIntoSortedLL708.Node(1);
        InsertIntoSortedLL708.Node head = new InsertIntoSortedLL708.Node(3, new InsertIntoSortedLL708.Node(4, last));
        last.next = head;
        InsertIntoSortedLL708.Node newHead = InsertIntoSortedLL708.insert(head, 2);
        System.out.print(newHead.val + " ");
        InsertIntoSortedLL708.Node n = newHead.next;
        while(n != newHead) {
            System.out.print(n.val + " ");
            n = n.next;
        }

    }

}