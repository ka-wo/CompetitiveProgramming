package com.kwolkowski.leetcode;

public class OddEvenLinkedList328 {
    // TODO : Change the solution to a simpler one,
    // where you create new head for Even nodes, and remove them from
    // the main list, at the end attach the evens to the last one of main.
    public static ListNode oddEvenList(ListNode head) {

        ListNode h = head;

        ListNode last = null;

        ListNode prevLast = null;
        int count = 0;
        ListNode origLast = null;
        while(head.next != null) {
            prevLast = head;
            head = head.next;
            count++;
        }
        origLast = head;
        last = count%2==0 ? head : prevLast;

        head = h;

        boolean even = false;
        ListNode previous = null;
        ListNode currentLast = last;
        while(head != last) {
            if(!even) {
                previous = head;
            } else {
                currentLast.next = head;
                previous.next = head.next;
                currentLast = currentLast.next;
            }
            head = head.next;
            even = !even;
        }
        if(count%2!=0) {
            currentLast.next = origLast;
        } else {
            currentLast.next = null;
        }

        return h;
    }
}
