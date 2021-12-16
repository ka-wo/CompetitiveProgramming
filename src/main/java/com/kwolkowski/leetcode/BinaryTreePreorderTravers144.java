package com.kwolkowski.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTravers144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        LinkedList<TreeNode> toVisit = new LinkedList<>();
        toVisit.add(root);
        while(!toVisit.isEmpty()) {
            TreeNode node = toVisit.pop();
            if(node == null) continue;
            list.add(node.val);
            toVisit.addFirst(node.right);
            toVisit.addFirst(node.left);
        }
        return list;
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
