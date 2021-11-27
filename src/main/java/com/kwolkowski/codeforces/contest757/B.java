package com.kwolkowski.codeforces.contest757;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                arr[j][0] = in.nextInt();
                arr[j][1] = j;
            }

            Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
            int count = 0;
            int end = n-1;
            int front = 1;
            int back = -1;

            int[] resArr = new int[n];
            while(end >= 0) {
                if(front < Math.abs(back)) {
                    count += 2 * front * arr[end][0];
                    resArr[arr[end][1]] = front;
                    front++;
                } else {
                    count += 2 * Math.abs(back) * arr[end][0];
                    resArr[arr[end][1]] = back;
                    back--;
                }
                end--;
            }
            System.out.println(count);
            System.out.print(0 + " ");
            for (int j = 0; j < resArr.length; j++) {
                System.out.print(resArr[j] + " ");
            }
            System.out.println();
        }
    }
}
