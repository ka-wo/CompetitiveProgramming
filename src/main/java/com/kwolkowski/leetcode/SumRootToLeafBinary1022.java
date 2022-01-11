package com.kwolkowski.leetcode;

public class SumRootToLeafBinary1022 {
    public int sumRootToLeaf(TreeNode root) {
        return sum(root, "");
    }

    public int sum(TreeNode root, String current) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) {
            return toDec(current + root.val);
        }
        return sum(root.left, current + root.val) + sum(root.right, current + root.val);
    }

    private int toDec(String s) {
        int count = 0;
        int mult = 1;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) == '1')
                count += mult;
            mult *=2;
        }
        return count;
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
