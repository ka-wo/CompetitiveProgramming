package com.kwolkowski.codeforces.educational120;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            String chars = in.next();


            TreeSet<Integer> t1 = new TreeSet<>();
            TreeSet<Integer> t0 = new TreeSet<>();

            char[] cs = chars.toCharArray();
            for (int j = 0; j < n; j++) {
                if(cs[j] == '1')
                    t1.add(arr[j]);
                else
                    t0.add(arr[j]);
            }
            LinkedList<Integer> l0 = new LinkedList<>(t0);
            LinkedList<Integer> l1 = new LinkedList<>(t1);

            for (int i1 : arr) {
                if(l0.contains(i1)) {
                    System.out.print((l0.indexOf(i1) + 1) + " ");
                } else {
                    System.out.print((l1.indexOf(i1) + l0.size() + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
