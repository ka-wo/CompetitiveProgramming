package com.kwolkowski.atcoder.contest228;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int T = in.nextInt();
        int X = in.nextInt();

        if(S < T) {
            if (S <= X && X < T) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            if (S <= X || X < T) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
