package com.kwolkowski.atcoder.contest228;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[][] res = new int[N][3];
        int[] sum = new int[N];
        for (int i = 0; i < N; i++) {
            res[i][0] = in.nextInt();
            res[i][1] = in.nextInt();
            res[i][2] = in.nextInt();
            sum[i] = res[i][0] + res[i][1] + res[i][2];
        }

        Arrays.sort(sum);
        int kthResult = sum[N-K];

        for (int i = 0; i < N; i++) {
            if(res[i][0] + res[i][1] + res[i][2] + 300 >= kthResult) {
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }

    }
}
