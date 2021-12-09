package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesInK25Test {

    @Test
    void t() {
        ListNode root = new ListNode(1, new ListNode(2)); // res -> 2, 1
//        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))); // res -> 2, 1, 4, 3, 5

        ReverseNodesInK25.reverseKGroup(root, 2);
    }

}