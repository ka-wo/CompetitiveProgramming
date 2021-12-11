package com.kwolkowski.codeforces.contest758;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            if(Math.abs(a-b) > 1 || n - (a+b) < 2){
                System.out.println("-1");
                continue;
            }

            if(a == 0 && b == 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
                continue;
            }

            boolean up = false;
            int top = n;
            int bot = 1;
            if(a>b) {
                System.out.print(bot + " ");
                up = true;
                bot++;
            } else {
                System.out.print(top + " ");
                top--;
            }
            boolean bLast = false;
            while(top >= bot) {
                if(a == 0 && b == 0) {
                    if(up) {
                        System.out.print(bot + " ");
                        bot++;
                    }else {
                        System.out.print(top + " ");
                        top--;
                    }
                }
                else if(a > b || (a == b && bLast)) {
                    System.out.print(top-- + " ");
                    up = false;
                    bLast = false;
                    a--;
                }else {
                    System.out.print(bot++ + " ");
                    up = true;
                    bLast = true;
                    b--;
                }
            }
            System.out.println();
        }
    }
}
