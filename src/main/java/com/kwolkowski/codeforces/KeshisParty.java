package com.kwolkowski.codeforces;

import java.util.Scanner;

public class KeshisParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
                b[j] = in.nextInt();
            }
            System.out.println(findMax(a, b));
        }
    }

    private static int findMax(int[] a, int[] b) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
//            int
        }
return max;
    }
}
