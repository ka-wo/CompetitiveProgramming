package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordBreak139Test {

    @Test
    void t() {
        assertTrue(WordBreak139.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    void t2() {
        assertTrue(WordBreak139.wordBreak("applepenapple", Arrays.asList("apple","pen")));
    }
    @Test
    void t3() {
        assertFalse(WordBreak139.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }

}