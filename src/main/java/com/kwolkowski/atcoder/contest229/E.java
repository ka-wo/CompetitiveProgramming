package com.kwolkowski.atcoder.contest229;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            var l1 = map.getOrDefault(a, new HashSet<>());
            l1.add(b);
            map.put(a, l1);

            var l2 = map.getOrDefault(b, new HashSet<>());
            l2.add(a);
            map.put(b, l2);
        }

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = i; j < N; j++) {
                if (!map.containsKey(j) || map.get(j).isEmpty()) {
                    count++;
                    continue;
                }
                map.get(j).remove(i);
                if (map.get(j).isEmpty())
                    count++;
                count  = Math.max(1, count);
            }
            System.out.println(count);
//            int count = 0;
//            final int aaaa = i;
//            for (var entry : map.entrySet()) {
//                if(entry.getKey() > i) {
//                    if(entry.getValue().stream().noneMatch(v -> v>aaaa))
//                        count++;
//                    count = Math.max(count, 1);
//                }
//            }
//            System.out.println(count);
        }
//        System.out.println(0);
    }
}
