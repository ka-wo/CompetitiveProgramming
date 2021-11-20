package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSum15Test {

    @Test
    void t() {
        List<List<Integer>> result = ThreeSum15.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        for (List<Integer> integers : result) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

}