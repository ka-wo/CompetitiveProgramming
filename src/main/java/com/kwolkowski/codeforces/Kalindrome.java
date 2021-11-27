package com.kwolkowski.codeforces;

import java.util.Scanner;

public class Kalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            if(isKali(arr, Integer.MIN_VALUE, 0, n-1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    private static boolean isKali(int[] arr, int toSkip, int start, int end) {

        while(start < end) {
            if(arr[start] == toSkip) {
                start++;
                continue;
            }
            if(arr[end] == toSkip) {
                end--;
                continue;
            }
            if(arr[start] == arr[end]) {
                start++;
                end--;
            } else {
                if(toSkip == Integer.MIN_VALUE) {
                    return isKali(arr, arr[start], start+1, end)
                            || isKali(arr, arr[end], start, end-1);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
