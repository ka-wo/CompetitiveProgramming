package com.kwolkowski.leetcode;

import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning131 {
    public List<List<String>> partition(String s) {

        List<List<String>> result = new LinkedList<>();
        dfs(s, 0, new LinkedList<>(), result);
        return result;
    }

    public void dfs(String s, int start, LinkedList<String> curr, List<List<String>> result) {
        if(start >= s.length()) {
            result.add(new LinkedList<>(curr));
            return;
        }
        for (int end = start+1; end <= s.length(); end++) {
            if(isPalindrome(s, start, end)) {
                String word = s.substring(start, end);
                curr.add(word);
                dfs(s, end, curr, result);
                curr.removeLast();
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while(end >= start) {
            if(s.charAt(start++) != s.charAt((end--)-1))
                return false;
        }
        return true;
    }
}
