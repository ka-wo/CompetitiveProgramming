package com.kwolkowski.leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BinaryTreePostorderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> l = new LinkedList<>();
        Set<TreeNode> checked = new HashSet<>();
        LinkedList<TreeNode> toVisit = new LinkedList<>();
        toVisit.add(root);
        while(!toVisit.isEmpty()){
            TreeNode node = toVisit.pop();
            if(node == null) continue;
            if(checked.contains(node)) {
                l.add(node.val);
                continue;
            }
            checked.add(node);
            toVisit.addFirst(node);
            toVisit.addFirst(node.right);
            toVisit.addFirst(node.left);
        }
        return l;
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
