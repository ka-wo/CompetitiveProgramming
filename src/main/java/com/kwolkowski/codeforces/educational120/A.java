package com.kwolkowski.codeforces.educational120;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int[] arr = new int[3];
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();
            Arrays.sort(arr);

            if(arr[2] == arr[1] + arr[0]
            || (arr[0] == arr[1] && arr[2] %2 == 0)
            || (arr[0] %2==0 && arr[1] == arr[2]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
