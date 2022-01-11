package com.kwolkowski.leetcode;

public class AddBinary67 {

    public static String addBinary(String a, String b) {
        int aLen = a.length()-1;
        int bLen = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(aLen >= 0 || bLen >= 0) {
            int count = carry;
            if(aLen >= 0) count += a.charAt(aLen--) - '0';
            if(bLen >= 0) count += b.charAt(bLen--) - '0';
            carry = count/2;
            count %= 2;
            sb.append(count);
        }
        if(carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }

}
