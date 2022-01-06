package com.kwolkowski.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class CarPooling1094 {
    public static boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(a -> a[1]));
        TreeMap<Integer, Integer> arrival = new TreeMap<>();

        for (int[] trip : trips) {
            int numPass = trip[0];
            int from = trip[1];
            int to = trip[2];
            Integer arrived = arrival.floorKey(from);
            while(arrived != null) {
                capacity += arrival.remove(arrived);
                arrived = arrival.floorKey(from);
            }
            capacity -= numPass;
            Integer count = arrival.getOrDefault(to, 0);
            arrival.put(to, numPass + count);

            if(capacity < 0) return false;
        }
        return true;
    }
}
