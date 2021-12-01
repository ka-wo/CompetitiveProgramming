package com.kwolkowski.codeforces.deltixautumn2021;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            long[] arr = new long[n];
//            long max = 0;
//            int maxInd = 0;
//            long secMax = 0;
//            int secMaxInd = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextLong();
//                if(arr[j] > max) {
//                    secMax = max;
//                    secMaxInd = maxInd;
//                    max = arr[j];
//                    maxInd = j;
//                } else if(arr[j] > secMax) {
//                    secMax = arr[j];
//                    secMaxInd = j;
//                }
            }
            long count = 0;
            for (int j = 0; j < arr.length; j++) {
                count = Math.max(count, getSum(arr, arr[j], j));
            }
//            long count = getSum(Arrays.copyOf(arr, arr.length), max, maxInd);
//            long count2 = getSum(arr, secMax, secMaxInd);
            System.out.println(count);
        }
    }

    private static long getSum(long[] arr, long max, int maxInd) {
        long[] ar = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i == maxInd) {
                continue;
            }
            long val = arr[i];
            while(val % 2 == 0) {
                val /= 2;
                max *= 2;
            }
            ar[i] = val;
        }
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ar[i];
        }
        return sum + max;
    }
}
