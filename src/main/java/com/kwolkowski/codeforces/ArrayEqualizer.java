package com.kwolkowski.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualizer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] a = new int[T];
        int[] b = new int[T];
        for (int i = 0; i < T; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < T; i++) {
            b[i] = in.nextInt();
        }

        int K = in.nextInt();
        for (int i = 0; i < K; i++) {
            b[0] = in.nextInt();
            System.out.println(solve(a, b));
        }

    }

    private static int solve(int[] a, int[] ba) {
        int op = 0;
        int[] b = Arrays.copyOf(ba, ba.length);
        for(int i=0; i<a.length; i++) {

            int diff = a[i] - b[i];
            op += Math.abs(a[i] - b[i]);

            int mult = i+1;
            int curr = i;
            while(curr < a.length) {
                b[curr] += diff;
                curr += mult;
            }

        }
        return op;


    }
}
