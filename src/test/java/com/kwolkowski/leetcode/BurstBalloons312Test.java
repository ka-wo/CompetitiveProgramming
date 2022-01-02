package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BurstBalloons312Test {

    @Test
    public void t() {
        assertEquals(167, BurstBalloons312.maxCoins(new int[]{3,1,5,8}));
    }

}