package com.kwolkowski.atcoder.contest229;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int limit = in.nextInt();
        long[][] a = new long[N][2];
//        int[] delicious = new int[N];
//        int[] grams = new int[N];

        for (int i = 0; i < N; i++) {
//            delicious[i] = in.nextInt();
//            grams[i] = in.nextInt();
            a[i][0] = in.nextInt();
            a[i][1] = in.nextInt();
        }
        Arrays.sort(a, Comparator.comparingLong(o -> o[0]));
        int last = N-1;
        long count = 0;
        while(limit > 0 && last >= 0) {
            if(a[last][1] <= limit) {
                limit -= a[last][1];
                count += a[last][0] * a[last][1];
            } else {
                count += a[last][0] * limit;
                limit = 0;
            }
            last--;
        }
        System.out.println(count);

    }
}
