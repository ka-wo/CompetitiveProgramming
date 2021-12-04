package com.kwolkowski.leetcode;

public class MaximumProductSub152 {

    public static int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(max * curr, Math.max(curr, min * curr));
            min = Math.min(max * curr, Math.min(curr, min * curr));
            max = tempMax;

            res = Math.max(res, max);
        }
        return res;
    }
}
