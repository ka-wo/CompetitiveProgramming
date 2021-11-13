package com.kwolkowski.codeforces;

import java.util.Scanner;

public class DominantCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            String s = in.next();
            System.out.println(solve(s, n));
        }
    }

    private static int solve(String s, int n) {
        if(s.contains("aa"))return 2;
        if(s.contains("aba")) return 3;
        if(s.contains("aca")) return 3;
        if(s.contains("abca")) return 4;
        if(s.contains("acba")) return 4;
        if(s.contains("abbacca")) return 7;
        if(s.contains("accabba")) return 7;
        return -1;
    }
}
