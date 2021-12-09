package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAbbr408Test {
    @Test
    void t() {
//        assertTrue(ValidAbbr408.validWordAbbreviation("internationalization", "i12iz4n"));
        assertFalse(ValidAbbr408.validWordAbbreviation("hi", "1hi"));
    }

}