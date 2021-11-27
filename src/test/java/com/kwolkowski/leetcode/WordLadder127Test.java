package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class WordLadder127Test {

    @Test
    void t() {
        int i = WordLadder127.ladderLength("hit", "cog", new LinkedList<String>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
        assertEquals(5, i);
    }
    @Test
    void t2() {
        int i = WordLadder127.ladderLength("hot", "dog", new LinkedList<String>(Arrays.asList("hot","cog","dog","tot","hog","hop","pot","dot")));
        assertEquals(3, i);
    }
}