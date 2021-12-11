package com.kwolkowski.codeforces.contest758;

import java.util.*;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n  = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int maxA = 0;
            int posA = 0;
            int maxB = 0;
            int posB = 0;

            LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();
            LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();

            for (int j = 0; j < n; j++) {
                map1.put( j, in.nextInt());
            }
            for (int j = 0; j < n; j++) {
                map2.put( j, in.nextInt());
            }

//            map1 = map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
//                    .collect(Collectors.toMap(Map.Entry::getKey,
//                            Map.Entry::getValue,
//                            (e1, e2) -> e1, LinkedHashMap::new));

            Set<Integer> res = new HashSet<>();
            LinkedList<Integer> toView = new LinkedList<>();
            toView.add(map1.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey());
            toView.add(map2.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey());

            while(!toView.isEmpty()) {
                int curr = toView.pop();
                res.add(curr);
                int val1 = map1.get(curr);
                int val2 = map2.get(curr);
                map1.entrySet().stream().filter(e -> e.getValue() > val1)
                        .map(Map.Entry::getKey)
                        .filter(e -> !res.contains(e))
                        .forEach(toView::add);
                map2.entrySet().stream().filter(e -> e.getValue() > val2)
                        .map(Map.Entry::getKey)
                        .filter(e -> !res.contains(e))
                        .forEach(toView::add);
            }

            for (int j = 0; j < n; j++) {
                if(res.contains(j))
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
