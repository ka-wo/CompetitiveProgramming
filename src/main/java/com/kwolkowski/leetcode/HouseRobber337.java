package com.kwolkowski.leetcode;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber337 {
    public static int rob(TreeNode root) {
        return rob(root, new HashMap<>());
    }
    public static int rob(TreeNode root, Map<TreeNode, Integer> memo) {
        if(memo.containsKey(root)) return memo.get(root);
        int res = Math.max(rob(root, true, memo), rob(root, false, memo));
        memo.put(root, res);
        return res;
    }

    public static int rob(TreeNode root, boolean rob, Map<TreeNode, Integer> memo) {
        if(root == null) return 0;
        if(rob) {
            return root.val + rob(root.left, false, memo) + rob(root.right, false, memo);
        } else {
            return rob(root.left, memo) + rob(root.right, memo);
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


