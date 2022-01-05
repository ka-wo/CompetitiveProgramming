package com.kwolkowski.google.kickstarter.y2021;

import java.util.*;

public class ARabbitHouse {
    static class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            for (int i = 0; i < T; i++) {
                int R = in.nextInt();
                int C = in.nextInt();
                int[][] m = new int[R][C];
                int max = 0;
                int maxJ = 0;
                int maxK = 0;
                TreeMap<Integer, LinkedList<String>> map = new TreeMap<>();
                for (int j = 0; j < R; j++) {
                    for (int k = 0; k < C; k++) {
                        int val = in.nextInt();
                        LinkedList<String> orDefault = map.getOrDefault(val, new LinkedList<>());
                        orDefault.add(key(j, k));
                        map.put(val, orDefault);
                        m[j][k] = val;
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + extracted(R, C, m, map));
            }
        }

        private static long extracted(int R, int C, int[][] m, TreeMap<Integer, LinkedList<String>> map) {
            long count = 0;
            Set<String> visited = new HashSet<>();
            NavigableSet<Integer> keys = map.descendingKeySet();
            while (!map.isEmpty()) {
                Integer first = keys.first();
                LinkedList<String> entries = map.remove(first);
                while (!entries.isEmpty()) {
                    String s = entries.pollFirst();
                    if (visited.contains(s)) continue;
                    visited.add(s);
                    count += checkNeighbours(s, first, m, map);
                }
            }
            return count;
        }

        private static long checkNeighbours(String key, Integer val, int[][] m, TreeMap<Integer, LinkedList<String>> map) {
            int count = 0;
            String[] split = key.split(",");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);
            count += diff(x + 1, y, m, val, map);
            count += diff(x - 1, y, m, val, map);
            count += diff(x, y + 1, m, val, map);
            count += diff(x, y - 1, m, val, map);
            return count;
        }

        private static int diff(int x, int y, int[][] m, Integer val, TreeMap<Integer, LinkedList<String>> map) {
            if (x < 0 || x >= m.length || y < 0 || y >= m[0].length) return 0;
            if (val - m[x][y] > 1) {
                int res = val - m[x][y] - 1;
                m[x][y] = val - 1;
                LinkedList<String> orDefault = map.getOrDefault(val - 1, new LinkedList<>());
                orDefault.add(key(x, y));
                map.put(val-1, orDefault);
                return res;
            }
            return 0;
        }

        private static String key(int maxJ, int maxK) {
            return maxJ + "," + maxK;
        }
    }
}
