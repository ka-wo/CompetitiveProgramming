package com.kwolkowski.codeforces;

import java.util.Scanner;

public class AMDeviation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int a3 = in.nextInt();

            int res = Math.abs((a3+a1)-2*a2);
            if(res % 3 == 0) System.out.println(0);
            else System.out.println(1);
        }

    }
}
