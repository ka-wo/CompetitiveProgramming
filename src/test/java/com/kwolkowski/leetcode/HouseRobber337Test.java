package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobber337Test {

    @Test
    void t() {
        HouseRobber337.TreeNode root = new HouseRobber337.TreeNode(3,
                new HouseRobber337.TreeNode(4, new HouseRobber337.TreeNode(1), new HouseRobber337.TreeNode(3)),
                new HouseRobber337.TreeNode(5, null, new HouseRobber337.TreeNode(1)));
        assertEquals(9, HouseRobber337.rob(root));

        HouseRobber337.TreeNode root2 = new HouseRobber337.TreeNode(3,
                new HouseRobber337.TreeNode(2, null, new HouseRobber337.TreeNode(3)),
                new HouseRobber337.TreeNode(3, null, new HouseRobber337.TreeNode(1)));
        assertEquals(7, HouseRobber337.rob(root2));

//        [4,1,null,2,null,3]
        HouseRobber337.TreeNode root3 = new HouseRobber337.TreeNode(4,
                new HouseRobber337.TreeNode(1, new HouseRobber337.TreeNode(2, null, new HouseRobber337.TreeNode(3)), null),
                null);
        assertEquals(7, HouseRobber337.rob(root3));

//        [2,1,3,null,4]
        HouseRobber337.TreeNode root4 = new HouseRobber337.TreeNode(2,
                new HouseRobber337.TreeNode(1, null, new HouseRobber337.TreeNode(4)),
                new HouseRobber337.TreeNode(3));
        assertEquals(7, HouseRobber337.rob(root4));
    }

}