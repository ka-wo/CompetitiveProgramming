package com.kwolkowski.atcoder.contest231;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < M; i++) {
            int a  = in.nextInt();
            int b  = in.nextInt();
            if(map.containsKey(a) && map.containsValue(a)
            || map.containsKey(b) && map.containsValue(b)) {
                System.out.println("No");
                return;
            }
            if(map.containsKey(a)) {
                map.put(b, a);
            } else if(map.containsKey(b)) {
                System.out.println("No");
                return;
            } else {
                map.put(a, b);
            }
        }

        // check for cycles
        LinkedList<Integer> toVisit = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        boolean[] done = new boolean[N];
        while(visited.size() != N) {
            for (int i = 0; i < N; i++) {
                if(!done[i]) {
                    toVisit.add(i+1);
                }
            }
            while (!toVisit.isEmpty()) {
                int val = toVisit.pop();
                if (visited.contains(val)) {
                    System.out.println("No");
                    return;
                }
                done[val-1] = true;
                visited.add(val);
                if (map.containsKey(val)) {
                    toVisit.add(map.get(val));
                }
            }
        }
        System.out.println("Yes");
    }
}
