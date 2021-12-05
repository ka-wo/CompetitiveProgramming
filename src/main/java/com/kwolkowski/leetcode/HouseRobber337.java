package com.kwolkowski.leetcode;

public class HouseRobber337 {
    public static int rob(TreeNode root) {
        return Math.max(rob(root, true), rob(root, false));
    }

    public static int rob(TreeNode root, boolean rob) {
        if(root == null) return 0;
        if(rob) {
            return root.val + rob(root.left, false) + rob(root.right, false);
        } else {
            return rob(root.left) + rob(root.right);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


