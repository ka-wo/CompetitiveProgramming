package com.kwolkowski.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTravers144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        traverse(root, list);
        return list;
    }

    public void traverse(TreeNode root, List<Integer> l) {
        if (root == null) return;
        l.add(root.val);
        traverse(root.left, l);
        traverse(root.right, l);
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
