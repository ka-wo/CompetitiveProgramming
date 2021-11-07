package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition35Test {

    SearchInsertPosition35 searchInsert = new SearchInsertPosition35();

    @Test
    void test() {
        assertEquals(2, searchInsert.searchInsert(new int[]{1,3,5,6}, 5));
        assertEquals(1, searchInsert.searchInsert(new int[]{1,3,5,6}, 2));
        assertEquals(4, searchInsert.searchInsert(new int[]{1,3,5,6}, 7));
        assertEquals(0, searchInsert.searchInsert(new int[]{1,3,5,6}, 0));
        assertEquals(0, searchInsert.searchInsert(new int[]{1}, 0));
    }

}