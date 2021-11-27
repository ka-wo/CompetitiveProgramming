package com.kwolkowski.atcoder.contest229;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        while(a > 0 && b > 0) {
            if(a%10 + b % 10 > 9) {
                System.out.println("Hard");
                return;
            }
            a/=10;
            b/=10;
        }
        System.out.println("Easy");

    }
}
