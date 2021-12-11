package com.kwolkowski.atcoder.contest231;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Map<String, Integer> count = new HashMap<>();
        String winner = "";
        int max = 0;
        for (int i = 0; i < num; i++) {
            String name =  in.next();
            Integer c = count.getOrDefault(name, 0);
            count.put(name, c+1);
            if(c+1 > max) {
                winner = name;
                max = c+1;
            }
        }
        System.out.println(winner);
    }
}
