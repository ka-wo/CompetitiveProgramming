package com.kwolkowski.codeforces.contest757;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int j = 0; j < T; j++) {


            int n = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();
            int k = in.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i : arr) {
                if (i < l || i > r) {
                    continue;
                }
                if (k - i < 0) break;
                k -= i;
                count++;
            }
            System.out.println(count);
        }
    }
}
