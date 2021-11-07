package com.kwolkowski.leetcode;

public class SquaresOfSortedArray977 {
    public int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        int startIndex = 0;
        int endIndex = nums.length-1;

        int start = nums[startIndex] * nums[startIndex];
        int end = nums[endIndex] * nums[endIndex];

        int lastIndex = nums.length-1;
        while(startIndex <= endIndex) {
            if(start > end) {
                result[lastIndex--] = start;
                startIndex++;
                start = nums[startIndex] * nums[startIndex];
            } else {
                result[lastIndex--] = end;
                endIndex--;
                if(endIndex >= 0)
                    end = nums[endIndex] * nums[endIndex];
            }
        }
        return result;
    }
}
