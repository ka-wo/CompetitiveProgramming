package com.kwolkowski.leetcode;

public class JumpGame55 {
    public static boolean canJump(int[] nums) {
        if(nums.length < 2) return true;
        int count = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(count <= 0) return false;
            count--;
            count = Math.max(count, nums[i]);
        }
        return true;
    }
}
