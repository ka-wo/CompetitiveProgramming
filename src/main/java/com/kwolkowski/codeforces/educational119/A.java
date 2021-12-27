package com.kwolkowski.codeforces.educational119;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String s = in.next();
            int countN = 0;
            for (char c : s.toCharArray()) {
                if(c == 'N')
                    countN++;
            }
            if(countN == 1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
