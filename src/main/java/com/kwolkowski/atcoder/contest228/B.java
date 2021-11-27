package com.kwolkowski.atcoder.contest228;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] A = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        boolean[] b = new boolean[N];
        while(!b[X-1]) {
            b[X-1] = true;
            count++;
            X = A[X-1];
        }
        System.out.println(count);
    }
}
