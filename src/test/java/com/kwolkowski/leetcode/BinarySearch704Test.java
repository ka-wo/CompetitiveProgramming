package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearch704Test {

    BinarySearch704 binarySearch = new BinarySearch704();

    @Test
    void test() {
        assertEquals(4, binarySearch.search(new int[]{-1,0,3,5,9,12}, 9));
        assertEquals(-1, binarySearch.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}