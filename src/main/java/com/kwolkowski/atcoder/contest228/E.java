package com.kwolkowski.atcoder.contest228;

import java.math.BigInteger;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int M = in.nextInt();

        int mod = 998244353;
        BigInteger res = BigInteger.valueOf(K);
        res = res.pow(N);
        BigInteger r = BigInteger.valueOf(M);
        r = r.pow(res.intValue());
        System.out.println(r.mod(BigInteger.valueOf(mod)).intValue());
    }
}
