package com.kwolkowski.codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            String binary = in.next();
            solve(n, binary);
        }
    }

    private static void solve(int n, String binary) {
        char[] b = binary.toCharArray();
        List<String> res = new LinkedList<>();
        int iter = 0;
        while(!sorted(b)) {
            iter++;
            int[] zPos = new int[n];
            int[] oPos = new int[n];
            int zeroes = 0;
            int ones = 0;
            int l = 0;
            int r = n - 1;

            while (l <= r) {
                if(zeroes > ones) {
                    if (b[l++] == '1') {
                        oPos[ones] = l - 1;
                        ones++;
                    }
                } else {
                    if (b[r--] == '0') {
                        zPos[zeroes] = r + 1;
                        zeroes++;
                    }
                }
            }
            res.add(buildRes(zPos, oPos, Math.min(zeroes, ones)));
            for (int i = 0; i < Math.min(zeroes, ones); i++) {
                char temp = b[zPos[i]];
                b[zPos[i]] = b[oPos[i]];
                b[oPos[i]] = temp;
            }
        }
        System.out.println(iter);
        for (String r : res) {
            System.out.println(r);
        }
    }

    private static String buildRes(int[] zPos, int[] oPos, int min) {
        StringBuilder sb = new StringBuilder();
        sb.append(min*2);
        sb.append(" ");
        for (int i = 0; i < min; i++) {
            sb.append(oPos[i] + 1 + " ");
        }
        for (int i = min-1; i >= 0; i--) {
            sb.append(zPos[i] + 1 + " ");
        }
        return sb.toString();
    }

    private static boolean sorted(char[] b) {
        for (int i = 0; i < b.length-1; i++) {
            if(b[i] > b[i+1]) return false;
        }
        return true;
    }
}
