package com.kwolkowski.leetcode.competition;

import java.util.Map;
import java.util.TreeMap;

public class MostBeautifulItem2070 {
    public static int[] maximumBeauty(int[][] items, int[] queries) {

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int[] item : items) {
            int val = map.getOrDefault(item[0], 0);
            map.put(item[0], Math.max(val, item[1]));
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> i : map.entrySet()){
            max = Math.max(max, i.getValue());
            i.setValue(max);
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Integer key = map.floorKey(queries[i]);
            if(key == null) res[i] = 0;
            else res[i] = map.get(key);
        }
        return res;
    }
}
