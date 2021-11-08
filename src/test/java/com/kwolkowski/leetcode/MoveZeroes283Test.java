package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZeroes283Test {

    MoveZeroes283 service = new MoveZeroes283();

    @Test
    void test() {
        int[] ints = {0, 1, 0, 3, 12};
        service.moveZeroes(ints);
        assertThat(ints).containsExactlyInAnyOrder(1,3,12,0,0);
    }
    @Test
    void test1() {
        int[] ints = {1, 0};
        service.moveZeroes(ints);
        assertThat(ints).containsExactlyInAnyOrder(1,0);
    }
}