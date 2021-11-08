package com.kwolkowski.leetcode;

import java.util.HashMap;

public class TwoSum167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> digits = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            digits.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int index = target-numbers[i];
            if(digits.containsKey(index)
                && digits.get(index) != i) {
                result[0] = Math.min(i + 1, digits.get(index)+1);
                result[1] = Math.max(i + 1, digits.get(index)+1);
            }
        }
        return result;
    }
}
