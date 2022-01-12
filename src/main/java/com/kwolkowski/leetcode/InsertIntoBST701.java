package com.kwolkowski.leetcode;

public class InsertIntoBST701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
       if(root == null) return new TreeNode(val);
        TreeNode node = root;
        while(true) {
            if(val < node.val) {
                if(node.left == null) {
                    node.left = new TreeNode(val);
                    return root;
                } else {
                    node = node.left;
                }
            } else {
                if(node.right == null) {
                    node.right = new TreeNode(val);
                    return root;
                } else {
                    node = node.right;
                }
            }
        }
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
