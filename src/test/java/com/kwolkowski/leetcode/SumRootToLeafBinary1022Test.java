package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafBinary1022Test {
    @Test
    public void t() {
//        [1,0,1,0,1,0,1]
        int sum = new SumRootToLeafBinary1022().sumRootToLeaf(
                new SumRootToLeafBinary1022.TreeNode(1, new SumRootToLeafBinary1022.TreeNode(0,
                        new SumRootToLeafBinary1022.TreeNode(0), new SumRootToLeafBinary1022.TreeNode(1)),
                        new SumRootToLeafBinary1022.TreeNode(1, new SumRootToLeafBinary1022.TreeNode(0), new SumRootToLeafBinary1022.TreeNode(1))));
        assertEquals(22, sum);
    }

}