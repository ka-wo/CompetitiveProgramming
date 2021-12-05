package com.kwolkowski.leetcode.biweekly66;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountCommon {
    public int countWords(String[] words1, String[] words2) {
        Set<String> appearBoth = new HashSet<>();
        HashMap<String, Integer> count1 = new HashMap<>();
        HashMap<String, Integer> count2 = new HashMap<>();

        for (String s : words1) {
            int count = count1.getOrDefault(s, 0);
            count1.put(s, count+1);
        }
        for (String s : words2) {
            int count = count2.getOrDefault(s, 0);
            count2.put(s, count+1);
            if(count1.containsKey(s)) appearBoth.add(s);
        }
        int count = 0;
        for (String s : appearBoth) {
            if(count1.get(s) == 1 && count2.get(s)==1)
                count++;
        }
        return count;
    }
}
