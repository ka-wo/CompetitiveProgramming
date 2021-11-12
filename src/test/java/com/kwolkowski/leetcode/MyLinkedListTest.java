package com.kwolkowski.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void test() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        myLinkedList.get(1);              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        myLinkedList.get(1);
    }

    @Test
    void test2() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1,2);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(0);
        System.out.println(myLinkedList.get(0));
    }

    @Test
    void test3() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0, 10);
        myLinkedList.addAtIndex(0,20);
        myLinkedList.addAtIndex(1,30);
        System.out.println(myLinkedList.get(1));
    }
}