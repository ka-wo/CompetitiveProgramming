package com.kwolkowski.leetcode;

public class BinaryTreeTilt563 {
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        root.val = Math.abs(leftSum - rightSum);
        return root.val + findTilt(root.left) + findTilt(root.right);
    }

    private int sumTree(TreeNode node) {
        if (node == null) return 0;
        return node.val + sumTree(node.left) + sumTree(node.right);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
