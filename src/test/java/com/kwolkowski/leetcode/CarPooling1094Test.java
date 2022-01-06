package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarPooling1094Test {
    @Test
    public void t() {
        assertFalse(CarPooling1094.carPooling(new int[][]{
                {2, 1, 5},
                {3, 3, 7}
        }, 4));

        assertTrue(CarPooling1094.carPooling(new int[][]{
                {2, 1, 5},
                {3, 3, 7}
        }, 5));
    }
}