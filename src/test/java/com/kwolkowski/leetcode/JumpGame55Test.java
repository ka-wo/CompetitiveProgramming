package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame55Test {
    @Test
    void t() {
        assertFalse(JumpGame55.canJump(new int[]{3,2,1,0,4}));
        assertTrue(JumpGame55.canJump(new int[]{3,2,1,1,4}));
    }

}