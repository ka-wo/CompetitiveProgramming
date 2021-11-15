package com.kwolkowski.leetcode.competition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    public void t() {
        Robot r = new Robot(4,5);
        r.move2(44);
        r.move2(19);
        r.move2(8);
        r.move2(36);
        System.out.println(r.getDir());
        System.out.println(r.getPos()[0] + " " + r.getPos()[1]);
    }

}