package com.kwolkowski.atcoder.contest229;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        if(line1.charAt(0) == '#' && line1.charAt(1)=='#'
        || line2.charAt(0) == '#' && line2.charAt(1)=='#'
        || line1.charAt(0) == '#' && line2.charAt(0)=='#'
        || line1.charAt(1) == '#' && line2.charAt(1)=='#'
        )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
