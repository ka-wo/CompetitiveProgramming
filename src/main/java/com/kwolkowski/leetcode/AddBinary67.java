package com.kwolkowski.leetcode;

public class AddBinary67 {

    public static String addBinary(String a, String b) {

        int i = a.length();
        int j = b.length();
        StringBuilder res = new StringBuilder();
        int rem = 0;
        while(i > 0 || j > 0) {
            int sum = 0;
            if(i > 0) sum += a.charAt(i-1) - '0';
            if(j > 0) sum += b.charAt(j-1) - '0';
            sum += rem;
            rem = sum / 2;
            res.append(sum % 2);
            i--;
            j--;
        }
        if(rem == 1) res.append('1');
        return res.reverse().toString();
    }

}
