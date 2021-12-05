package com.kwolkowski.leetcode.biweekly66;


public class MinimumBuckets {
    public static int minimumBuckets(String street) {

        boolean[] a = new boolean[street.length()];
        int count =0;

        if(street.length() == 1 && street.equals("H")) return -1;
        if(street.length() == 1 && street.equals(".")) return 0;

        for (int i = 0; i < street.length(); i++) {
            if(street.charAt(i) == 'H') {
                if(i > 0 && a[i-1]){
                    continue;
                }
                if(i < street.length()-1 && street.charAt(i+1) == '.') {
                    a[i+1] = true;
                    count++;
                    continue;
                }
                if(i < street.length()-1 && street.charAt(i+1) == 'H'
                && i>0 && street.charAt(i-1) == '.') {
                    count++;
                    continue;
                }
                if(i>0 && street.charAt(i-1) == '.') {
                    count++;
                    continue;
                }
                return -1;
            }
        }
        return count;
    }
}
