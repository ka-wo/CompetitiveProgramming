package com.kwolkowski.leetcode;

public class DesignLinkedList {
}

class ListNode2 {

    int val;
    ListNode2 next;

    public ListNode2(int val, ListNode2 node) {
        this.val = val;
        this.next = node;
    }
    public ListNode2() {
        this.next = null;
    }
}

class MyLinkedList {

    ListNode2 head;

    public MyLinkedList() {

    }

    public int get(int index) {
        ListNode2 cur = head;
        if(cur == null) return -1;
        while(index > 0){
            if(cur.next == null) return -1;
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        if(head == null)  {
            head = new ListNode2(val, null);
            return;
        }
        ListNode2 cur = new ListNode2(val, head);
        head = cur;
    }

    public void addAtTail(int val) {
        if(head == null) {
            head = new ListNode2(val, null);
            return;
        }
        ListNode2 next = head;
        while(next.next != null) {
            next = next.next;
        }
        next.next = new ListNode2(val, null);
    }

    public void addAtIndex(int index, int val) {
        if(index == 0) {
            addAtHead(val);
            return;
        }
        ListNode2 cur = head;
        ListNode2 prev = new ListNode2(0, head);;
        while(index > 0) {
            if(cur == null) return;
            prev = cur;
            cur = cur.next;
            index--;
        }
        prev.next = new ListNode2(val, cur);
    }

    public void deleteAtIndex(int index) {
        if(index == 0) {
            this.head = head.next;
            return;
        }
        ListNode2 cur = head;
        ListNode2 prev = new ListNode2(0, head);
        while(index > 0) {
            if(cur.next == null) return;
            prev = cur;
            cur = cur.next;
            index--;
        }
        prev.next = cur.next;
    }
}
