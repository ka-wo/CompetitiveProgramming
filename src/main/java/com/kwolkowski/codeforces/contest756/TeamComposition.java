package com.kwolkowski.codeforces.contest756;

import java.util.Scanner;

public class TeamComposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int res = 0;
            if(a>b) {
                res += calc(a, b);
                a -= (res*3);
                b -= res;
            } else {
                res += calc(b, a);
                a -= res*3;
                b -= res;
            }



            System.out.println(res);
        }
    }

    private static int calc(int a, int b) {
        if(a <= 0 || b <= 0) return 0;
        int threePerA = Math.min(a, b/3);
        int threePerB = Math.min(a/3, b);
        if(threePerA == 0 && threePerB==0) return 0;
        if(threePerA >= threePerB) {
            return threePerA + calc(a - threePerA, b-threePerA*3);
        }
        else {
            return threePerB + calc(a - threePerB*3, b-threePerB);
        }
    }
}
