package com.kwolkowski.atcoder.contest231;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int Q = in.nextInt();
        int[] h = new int[num];
        for (int i = 0; i < num; i++) {
            h[i] = in.nextInt();
        }

        Arrays.sort(h);
        for (int i = 0; i < Q; i++) {
            int q = in.nextInt();

            int start=0;
            int end = num-1;
            while(end >= start) {
                if(h[start] >= q) {
                    System.out.println(num - start);
                    break;
                }
                if(h[end] < q) {
                    System.out.println(num-end-1);
                    break;
                }
                if(h[end] == q) {
                    System.out.println(num-end);
                    break;
                }
                int middle = (end - start) / 2 + start;
                if(h[middle] < q) {
                    start = middle+1;
                } else {
                    end = middle-1;
                }
            }
        }
    }
}
