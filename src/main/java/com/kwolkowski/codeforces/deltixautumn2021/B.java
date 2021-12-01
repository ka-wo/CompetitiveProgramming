package com.kwolkowski.codeforces.deltixautumn2021;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        char[] chars = s.toCharArray();
        int count = 0;
        int index = 0;
        while (s.indexOf("abc", index) != -1) {
            count++;
            index = s.indexOf("abc", index) + 1;
        }
        for (int i = 0; i < q; i++) {
            int pos = in.nextInt() - 1;
            char c = in.next().toCharArray()[0];

            if((c == 'b' && chars[pos] == 'b')
                    || (c == 'a' && chars[pos] == 'a')
                    || (c == 'c' && chars[pos] == 'c')) {
                System.out.println(count);
                continue;
            }

            int top = s.indexOf("abc", Math.max(0,pos-3));
            chars[pos] = c;
            s = new String(chars);
            int newTop = s.indexOf("abc", Math.max(0,pos-3));
            if(newTop == top) {
            } else if(newTop == -1) {
                count--;
            }else if(newTop < top) {
                count++;
            } else {
                count--;
            }
            System.out.println(count);
        }
    }
}
