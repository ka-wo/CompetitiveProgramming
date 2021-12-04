package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSub152Test {

    @Test
    void t() {
        System.out.println(MaximumProductSub152.maxProduct(new int[]{2,3,-2,0,-2,4,-2}));
        System.out.println(MaximumProductSub152.maxProduct(new int[]{2,-5,-2,-4,3}));
        System.out.println(MaximumProductSub152.maxProduct(new int[]{3,-1,4}));
        System.out.println(MaximumProductSub152.maxProduct(new int[]{0,2}));
    }

}