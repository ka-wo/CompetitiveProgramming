package com.kwolkowski.codeforces.educational118;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            int n = in.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            int pairs = n/2;
            List<Integer> s = Arrays.asList(arr);
            outer: for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if(arr[j] != arr[k]){
                        if(!s.contains(arr[j] % arr[k])) {
                            System.out.println(arr[j] + " " + arr[k]);
                            pairs--;
                            if(pairs == 0) break outer;
                        }else if(!s.contains(arr[k] % arr[j])) {
                            System.out.println(arr[k] + " " + arr[j]);
                            pairs--;
                            if(pairs == 0) break outer;
                        }
                    }
                }
            }
        }
    }
}
