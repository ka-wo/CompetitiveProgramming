package com.kwolkowski.leetcode;

import java.util.Arrays;

public class ThreeClosestSum16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length-2; i++) {
            int first = nums[i];
            int start = i + 1;
            int end = nums.length-1;

            while(start < end) {
                int sum = first + nums[start] + nums[end];
                if(Math.abs(target-sum) <= Math.abs(target-closest)) {
                    closest = sum;
                    if (sum == target) return sum;
                }
                if(sum < target) start++;
                if(sum > target) end--;
            }
        }
        return closest;

    }
}
