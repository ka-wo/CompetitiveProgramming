package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinary67Test {

    @Test
    public void t() {
        assertEquals("100", AddBinary67.addBinary("11", "1"));
        assertEquals("10101", AddBinary67.addBinary("1010", "1011"));

    }

}