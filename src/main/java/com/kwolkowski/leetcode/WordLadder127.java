package com.kwolkowski.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordLadder127 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord)) return 0;
        if (!wordList.contains(endWord)) return 0;
        // lista list slow w ktore mozna pojsc
        Map<String, List<String>> map = new HashMap<>();
        wordList.add(beginWord);
        for (int i = 0; i < wordList.size(); i++) {
            List<String> possibleMoves = new LinkedList<>();
            for (int j = 0; j < wordList.size(); j++) {
                if (i == j) continue;
                if (oneDiff(wordList.get(i), wordList.get(j)))
                    possibleMoves.add(wordList.get(j));
            }
            map.put(wordList.get(i), possibleMoves);
        }

        // bfs
        LinkedList<String> visited = new LinkedList<>();
        LinkedList<String> toVisit = new LinkedList<>();
        toVisit.add(beginWord);
        int count = 0;
        int level = 1;
        while (!toVisit.isEmpty()) {
            if(level == 0) {
                count++;
                level = toVisit.size();
            }
            String current = toVisit.pop();
            visited.add(current);
            if (current.equals(endWord)) return count + 1;
            List<String> strings = map.get(current);
            for (String s : strings) {
                if (!visited.contains(s))
                    toVisit.add(s);
            }
            level--;
        }
        return 0;
    }

    private static boolean oneDiff(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) diff++;
        }
        diff += Math.abs(s1.length() - s2.length());
        return diff == 1;
    }
}
