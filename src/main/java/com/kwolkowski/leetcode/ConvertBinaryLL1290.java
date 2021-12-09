package com.kwolkowski.leetcode;

public class ConvertBinaryLL1290 {

    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while(head != null) {
            num *= 2;
            num += head.val;
            head = head.next;
        }
        return num;
    }

}
