package com.kwolkowski.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordDictionary211 {

    Map<Integer, Set<String>> words;

    public WordDictionary211() {
        words = new HashMap<>();
    }

    public void addWord(String word) {
        Set<String> set = words.getOrDefault(word.length(), new HashSet<>());
        set.add(word);
        words.put(word.length(), set);
    }

    public boolean search(String word) {
        Set<String> strings = words.getOrDefault(word.length(), new HashSet<>());
        outer: for (String s : strings) {
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == '.' || word.charAt(i) == s.charAt(i)){
                    continue;
                } else {
                    continue outer;
                }
            }
            return true;
        }
        return false;
    }
}
