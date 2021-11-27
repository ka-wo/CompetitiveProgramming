package com.kwolkowski.codeforces.contest756;

import java.util.Scanner;

public class PolycarpRecovers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            
            solve(arr, new int[n], 0, n-1, 0, n-1);
        }
    }

    private static void solve(int[] arr, int[] res, int startA, int endA, int startB, int endB) {
//        if(arr[startA])
    }
}
