package com.kwolkowski.leetcode.competition;

import org.junit.jupiter.api.Test;

class MostBeautifulItem2070Test {

    @Test
    void t() {
        int[] res = MostBeautifulItem2070.maximumBeauty(new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}}, new int[]{1, 2, 3, 4, 5, 6});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    @Test
    void t2() {
        int[] res = MostBeautifulItem2070.maximumBeauty(new int[][]{{10, 1000}}, new int[]{5});
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}