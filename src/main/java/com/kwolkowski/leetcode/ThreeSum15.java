package com.kwolkowski.leetcode;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new LinkedList<>();
        Set<String> added = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            int first = nums[i];
            int start = i+1;
            int end = nums.length-1;
            while(start < end) {
                int sum = first + nums[start] + nums[end];
                if(sum == 0) {
                    String key = first + "," + nums[start] + "," + nums[end];
                    if(!added.contains(key)) {
                        results.add(Arrays.asList(first, nums[start], nums[end]));
                        added.add(key);
                    }
                    start++;
                }
                if(sum < 0) start++;
                if(sum > 0) end--;
            }
        }
        return results;
    }
}
