package com.kwolkowski.leetcode;

import java.util.List;

public class WordBreak139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        int current = 0;

        while(current < s.length()) {
            if(!res[current]) {
                current++;
                continue;
            }

            for (String word : wordDict) {
                if(s.substring(current).startsWith(word)) {
                    if(current + word.length() == s.length()) return true;
                    else if (current + word.length() < s.length())
                        res[current + word.length()] = true;
                }
            }
            current++;
        }
        return false;
    }
}
