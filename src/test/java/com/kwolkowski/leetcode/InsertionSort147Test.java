package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSort147Test {

    @Test
    void t() {
        ListNode sorted = InsertionSort147.insertionSortList(new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3)))));
        while(sorted != null) {
            System.out.print(sorted.val + " ");
            sorted = sorted.next;
        }
    }

}