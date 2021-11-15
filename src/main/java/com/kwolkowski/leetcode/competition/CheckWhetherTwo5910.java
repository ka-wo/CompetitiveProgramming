package com.kwolkowski.leetcode.competition;

import java.util.HashMap;
import java.util.Map;

public class CheckWhetherTwo5910 {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> count1 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            int c = count1.getOrDefault(word1.charAt(i), 0);
            count1.put(word1.charAt(i), c+1);
        }
        for (int i = 0; i < word2.length(); i++) {
            int c = count1.getOrDefault(word2.charAt(i), 0);
            count1.put(word2.charAt(i), c-1);
        }
        return !count1.values().stream().anyMatch(a -> Math.abs(a) > 3);
    }

}
