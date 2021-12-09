package com.kwolkowski.leetcode;

public class ValidAbbr408 {
    public static boolean validWordAbbreviation(String word, String abbr) {
        int num = 0;
        int first = 0;
        int sec = 0;
        while (first < word.length()) {
            char c = sec < abbr.length() ? abbr.charAt(sec) : '&';
            if (c <= '9' && c >= '0') {
                if (c == '0' && num == 0) return false;
                num *= 10;
                num += c - '0';
                sec++;
            } else if (num != 0) {
                first += num;
                num = 0;
            } else if (word.charAt(first) == c) {
                first++;
                sec++;
            } else {
                return false;
            }

        }
        return first == word.length() && sec == abbr.length();
    }
}
