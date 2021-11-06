package com.kwolkowski.leetcode;

public class FirstBadVersion278 {

    // https://leetcode.com/problems/first-bad-version/
    // use binary search to minimize the number of calls
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end-start) / 2;
            if(isBadVersion(mid)) {
                // if middle is bad we want to check previous versions
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
