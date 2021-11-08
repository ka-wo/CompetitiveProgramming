package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSum167Test {

    TwoSum167 service = new TwoSum167();

    @Test
    void test() {
        int[] result = service.twoSum(new int[]{2,7,11,15}, 9);
        assertThat(result).contains(1,2);
    }
}