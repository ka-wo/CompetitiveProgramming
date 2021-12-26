package com.kwolkowski.google.kickstarter.y2021;

import java.util.*;
import java.io.*;

public class AGoodnessString {

    static class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            int T = in.nextInt();
            for (int i = 1; i <= T; ++i) {
                int N = in.nextInt();
                int K = in.nextInt();
                String s = in.next();
                System.out.println("Case #" + i + ": " + solve(N, K, s.toCharArray()));
            }
        }

        private static int solve(int n, int k, char[] s) {
            int count = 0;
            for (int i = 0; i < n / 2; i++) {
                if (s[i] != s[n - i - 1]) count++;
            }
            return Math.abs(count - k);
        }
    }
}