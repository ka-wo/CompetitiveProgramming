package com.kwolkowski.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures739 {
    public static int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            if(stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            int t = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()] < t) {
                Integer pop = stack.pop();
                result[pop] = i-pop;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = 0;
        }
        return result;
    }
}
