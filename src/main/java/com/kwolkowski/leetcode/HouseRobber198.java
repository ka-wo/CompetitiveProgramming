package com.kwolkowski.leetcode;

public class HouseRobber198 {
    public static int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] sol = new int[nums.length+3];
        sol[0] = nums[0];
        sol[1] = nums[1];
        int max = Math.max(sol[0], sol[1]);
        for (int i = 0; i < nums.length-2; i++) {
            sol[i+2] = Math.max(sol[i+2], sol[i] + nums[i+2]);
            if(i < nums.length-3)
                sol[i+3] = Math.max(sol[i+3], sol[i] + nums[i+3]);
            max = Math.max(max,
                    Math.max(sol[i+2], sol[i+3]));
        }
        return max;
    }
}
