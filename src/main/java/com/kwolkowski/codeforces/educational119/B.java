package com.kwolkowski.codeforces.educational119;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long w = (long) in.nextInt();
            long h = (long) in.nextInt();


            int k1 = in.nextInt();
            int[] xUp = new int[k1];
            for (int j = 0; j < k1; j++) {
                xUp[j] = in.nextInt();
            }
            int k2 = in.nextInt();
            int[] xDown = new int[k2];
            for (int j = 0; j < k2; j++) {
                xDown[j] = in.nextInt();
            }
            int k3 = in.nextInt();
            int[] yLeft = new int[k3];
            for (int j = 0; j < k3; j++) {
                yLeft[j] = in.nextInt();
            }
            int k4 = in.nextInt();
            int[] yRight = new int[k4];
            for (int j = 0; j < k4; j++) {
                yRight[j] = in.nextInt();
            }

            long maxX = Math.max(xUp[k1-1] - xUp[0], xDown[k2-1]-xDown[0]);
            long maxY = Math.max(yLeft[k3-1] - yLeft[0], yRight[k4-1]-yRight[0]);
            System.out.println(Math.max(maxX * h, maxY * w));
        }
    }
}
