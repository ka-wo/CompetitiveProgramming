package com.kwolkowski.codeforces.educational120;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextLong();
            }
            System.out.println(solve(arr, k));
        }
    }

    private static int solve(long[] arr, long k) {
        Arrays.sort(arr);
        long sum = 0;
        int steps = 0;
        for (long i : arr) {
            sum += i;
        }
        long min = k/arr.length + 1;
        if(min < arr[0]) {
            steps += (arr[0] - min);
            sum -= (arr[0] - min);
            arr[0] = min;
        }
        while(k < arr[0] * arr.length) {
            steps++;
            arr[0] = arr[0] - 1;
            sum--;
        }
        int possSteps = doSomething(steps, arr, k, sum);
        for (int i = 0; i < 20; i++) {
            steps++;
            arr[0] = arr[0]-1;
            sum--;
            int newSteps = doSomething(steps, arr, k, sum);
            if(newSteps < possSteps)possSteps = newSteps;
        }
        return possSteps;
    }

    private static int doSomething(int steps, long[] arr, long k, long sum) {
        for (int i = arr.length-1; i > 0; i--) {
            if(k >= sum) return steps;
            steps++;
            sum -= (arr[i] - arr[0]);
        }
        return steps;
    }
}
