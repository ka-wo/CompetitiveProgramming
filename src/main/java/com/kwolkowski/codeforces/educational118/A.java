package com.kwolkowski.codeforces.educational118;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int currX = in.nextInt();
            int currP = in.nextInt() + (int) Math.log10(currX);
            int x = in.nextInt();
            int p = in.nextInt() + (int)Math.log10(x);

            if(currP > p) {
                System.out.println(">");
            } else if(currP == p) {
                while((int)Math.log10(x) != (int)Math.log10(currX)) {
                    if(x < currX) x *=10;
                    else currX *= 10;
                }
                if(currX > x) {
                    System.out.println(">");
                } else if(currX == x) {
                    System.out.println("=");
                } else {
                    System.out.println("<");
                }
            } else {
                System.out.println("<");
            }
        }
    }
}
