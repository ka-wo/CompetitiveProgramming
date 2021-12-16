package com.kwolkowski.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        traverse(root, l);
        return l;
    }

    private void traverse(TreeNode node, List<Integer> l){
        if(node == null) return;
        traverse(node.left, l);
        l.add(node.val);
        traverse(node.right, l);
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
