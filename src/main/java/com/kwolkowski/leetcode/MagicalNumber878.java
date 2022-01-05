package com.kwolkowski.leetcode;

import java.math.BigInteger;

public class MagicalNumber878 {
    static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        MagicalNumber878 m = new MagicalNumber878();
//        System.out.println(m.nthMagicalNumber(1,2,3));
//        System.out.println(m.nthMagicalNumber(4, 2, 3));
//        System.out.println(m.nthMagicalNumber(5, 2, 4));
        System.out.println(m.nthMagicalNumber(3, 6, 4));
        System.out.println(m.nthMagicalNumber2(3, 6, 4));
//        System.out.println(m.nthMagicalNumber(1000000000, 40000,40000));

    }

    public int nthMagicalNumber(int n, int a, int b) {
        int lower = Math.min(a, b);
        int higher = Math.max(a, b);
        int gc = gcd(lower, higher);
        int lcm = a * b / gc;
        int c = lcm / a + lcm / b - 1;
        BigInteger num = BigInteger.valueOf(lcm).multiply(BigInteger.valueOf(n).divide(BigInteger.valueOf(c)));
        int nn = num.divide(BigInteger.valueOf(a)).intValue()
                +num.divide(BigInteger.valueOf(b)).intValue()
                -num.divide(BigInteger.valueOf(lcm)).intValue();

        while (nn > n) {
            num = num.subtract(BigInteger.valueOf(lcm));
            nn -= c;
        }
        int sum =0;
        int bigCount = 0;
        while(nn != n){
            if(sum+lower>higher){
                nn++;
                num = num.add(BigInteger.valueOf(higher).subtract(BigInteger.valueOf(sum)));
                bigCount++;
                sum-= higher;
            } else {
                if(sum < 0) {
                    num = num.add(BigInteger.valueOf(sum));
                }
                num = num.add(BigInteger.valueOf(lower));
                sum += lower;
                nn++;
            }
        }

        return num.mod(BigInteger.valueOf(MOD)).intValue();
    }


    public int nthMagicalNumber2(int n, int a, int b) {
        int lower = Math.min(a, b);
        int higher = Math.max(a, b);
        int gc = gcd(lower, higher);
        int lcm = a * b / gc;
        long num = 0;
        int nn = 0;
        int c = lcm / a + lcm / b - 1;
        num += lcm * (n/c);
        nn = (int) num / a + (int) num / b - (int) num / lcm;
        while (nn > n) {
            num -= lcm;
            nn -= c;
        }
        int sum =0;
        int next=0;
        while(nn != n){
            if(sum+lower>higher){
                num += higher - sum;
                nn++;
                sum-= higher;
            } else {
                if(sum < 0) {
                    num += sum;
                }
                num += lower;
                sum += lower;
                nn++;
            }
        }

        return (int) num % MOD;
    }


    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
