package com.kwolkowski.atcoder.contest229;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = in.nextInt();

        int start = 0;
        int end = 0;
        int maxCount = 0;
        while(end < s.length()) {
            if(s.charAt(end) == 'X') {
                end++;
                maxCount = Math.max(maxCount, end-start);
                continue;
            } else if(count > 0) {
                end++;
                count--;
                maxCount = Math.max(maxCount, end-start);
                continue;
            } else {
                if(s.charAt(start) == 'X') {
                    start++;
                } else {
                    count++;
                    start++;
                }
            }
        }
        System.out.println(maxCount);
    }
}
