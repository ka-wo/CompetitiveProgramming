package com.kwolkowski.leetcode;

import java.util.Arrays;

public class JumpGameII45 {
    public static int jump(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        res[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            if(res[i] == -1) continue;
            int count = nums[i];
            for (int j = 1; j <= count; j++) {
                if(i+j >= nums.length) break;
                if(res[i+j] == -1) res[i+j] = res[i] + 1;
                else {
                    res[i+j] = Math.min(res[i+j], res[i]+1);
                }
            }
        }
        return res[nums.length-1];
    }
}
