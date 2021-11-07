package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArray977Test {

    SquaresOfSortedArray977 sosa = new SquaresOfSortedArray977();

    @Test
    void test() {
        assertThat(sosa.sortedSquares(new int[]{-4,-1,0,3,10})).containsExactlyInAnyOrder(0,1,9,16,100);
        assertThat(sosa.sortedSquares(new int[]{-7,-3,2,3,11})).containsExactlyInAnyOrder(4,9,9,49,121);
    }

}