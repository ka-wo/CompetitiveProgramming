package com.kwolkowski.codeforces.contest757;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int [] arr = new int[T];
        int max = 0;
        int ind = 0;
        for (int i = 0; i < T; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > max) {
                max = Math.max(arr[i], max);
                ind = i;
            }
        }
        arr[ind] = 1;
        int count = max;
        int last = max;
        int index = 1;
        while(index < T) {
            int maxG = 1;
            int indx = 0;
            for (int i = 0; i < T; i++) {
                int gd = gcd(last, arr[i]);
                if(gd > maxG) {
                    maxG = gd;
                    indx = i;
                }
            }
            if(maxG == 1) {
                count += T-index;
                break;
            }
            count += maxG;
            last = arr[indx];
            arr[indx] = 1;

            index++;
        }

        System.out.println(count);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
