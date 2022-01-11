package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotCircle1041Test {

    @Test
    public void t() {
        assertTrue(RobotCircle1041.isRobotBounded("GGLLGG"));
        assertFalse(RobotCircle1041.isRobotBounded("GG"));
        assertTrue(RobotCircle1041.isRobotBounded("GL"));
    }
}