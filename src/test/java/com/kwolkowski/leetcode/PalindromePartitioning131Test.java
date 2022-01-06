package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioning131Test {

    @Test
    public void t() {
        List<List<String>> aab = new PalindromePartitioning131().partition("aab");
        for (List<String> strings : aab) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void t2() {
        List<List<String>> aab = new PalindromePartitioning131().partition("cbbbcc");
        for (List<String> strings : aab) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

}