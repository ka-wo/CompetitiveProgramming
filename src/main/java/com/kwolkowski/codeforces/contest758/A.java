package com.kwolkowski.codeforces.contest758;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int start = 4;
        for (int i = 0; i < T; i++) {
            int num = in.nextInt();
            for (int j = 0; j < num; j++) {
                System.out.print(start + " ");
                start+=2;
            }
            System.out.println();
            start = 4;
        }
    }
}
