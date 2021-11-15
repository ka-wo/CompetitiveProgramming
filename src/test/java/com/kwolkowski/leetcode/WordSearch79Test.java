package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearch79Test {
    
    @Test
    void t() {
        assertTrue(WordSearch79.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S' },{'A','D','E','E'}}, "ABCCED"));
    }

    @Test
    void t2() {
        assertFalse(WordSearch79.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
    }

}