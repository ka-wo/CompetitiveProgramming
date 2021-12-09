package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryLL1290Test {

    @Test
    void t() {
        assertEquals(5, ConvertBinaryLL1290.getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1)))));
    }

}