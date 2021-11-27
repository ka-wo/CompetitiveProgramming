package com.kwolkowski.leetcode;

public class TwoSumII167 {
    public int[] twoSum(int[] numbers, int target) {
        int start=0, end=numbers.length-1;

        while(start<end) {
            int cur = numbers[start] + numbers[end];
            if(cur == target) break;
            if(cur < target) start++;
            else end--;
        }
        return new int[]{start+1, end+1};
    }
}
