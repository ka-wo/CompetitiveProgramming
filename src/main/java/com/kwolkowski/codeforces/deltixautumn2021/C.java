package com.kwolkowski.codeforces.deltixautumn2021;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        char[] chars = s.toCharArray();



        for (int i = 0; i < q; i++) {
            int pos = in.nextInt() -1;
            char c = in.next().toCharArray()[0];
            chars[pos] = c;
            int count = 0;
            s = new String(chars);
            int index = 0;
            while (s.indexOf("abc", index) != -1) {
                count++;
                index = s.indexOf("abc", index) + 1;
            }
            System.out.println(count);
        }
    }
}
