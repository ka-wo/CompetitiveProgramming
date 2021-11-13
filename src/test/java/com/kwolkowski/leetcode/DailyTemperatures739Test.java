package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DailyTemperatures739Test {

    @Test
    void t() {
        int[] result = DailyTemperatures739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        assertThat(result).containsExactlyInAnyOrder(1,1,4,2,1,1,0,0);

    }

}