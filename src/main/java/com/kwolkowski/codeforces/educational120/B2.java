package com.kwolkowski.codeforces.educational120;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            String chars = in.next();

            char[] cs = chars.toCharArray();
            int zeroes = 0;
            for (char c : cs) {
                if(c == '0') zeroes++;
            }

            int p0 = 0;
            int p1 = 0;
            while(p0 < cs.length && p1 < cs.length) {
                if(cs[p0] == '0') {
                    if(arr[p0] <= zeroes) {
                        p0++;
                        continue;
                    }
                } else {
                    p0++;
                    continue;
                }
                if(cs[p1] == '1') {
                    if(arr[p1] > zeroes) {
                        p1++;
                        continue;
                    }
                } else {
                    p1++;
                    continue;
                }
                swap(arr, p1, p0);
                p1++;
                p0++;
            }
            for (int i1 : arr) {
                System.out.print(i1 + " ");
            }
            System.out.println();
        }
    }

    private static void swap(int[] arr, int p1, int p0) {
        int temp = arr[p1];
        arr[p1] = arr[p0];
        arr[p0] = temp;
    }
}
