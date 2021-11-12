package com.kwolkowski.codeforces;

import java.util.Scanner;

public class LinearKeyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String keyboard = in.next();
            String stringToType = in.next();
            System.out.println(calculateTime(keyboard, stringToType));
        }
    }

    public static int calculateTime(String keyboard, String string) {
        int sum = 0;
        for (int i = 0; i < string.length()-1; i++) {
            sum += Math.abs(keyboard.indexOf(string.charAt(i)) - keyboard.indexOf(string.charAt(i+1)));
        }
        return sum;
    }
}
