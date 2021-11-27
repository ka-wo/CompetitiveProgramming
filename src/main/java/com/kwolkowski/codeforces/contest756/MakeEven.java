package com.kwolkowski.codeforces.contest756;

import java.util.Scanner;

public class MakeEven {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int num = in.nextInt();
            if(num%2 == 0) {
                System.out.println(0);
                continue;
            }
            boolean hasEven = false;
            boolean lastEven = false;
            while(num > 0) {
                if(num % 2 ==0){
                    hasEven=true;
                }
                lastEven = num % 2 ==0;
                num /=10;
            }
            if(lastEven) {
                System.out.println(1);
                continue;
            }
            if(hasEven) {
                System.out.println(2);
                continue;
            }
            System.out.println(-1);
        }
    }
}
