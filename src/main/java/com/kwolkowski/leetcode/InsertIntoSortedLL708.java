package com.kwolkowski.leetcode;

public class InsertIntoSortedLL708 {
    public static Node insert(Node head, int insertVal) {
        if (head == null) {
            Node n = new Node(insertVal);
            n.next = n;
            return n;
        }
        if (head == head.next) {
            head.next = new Node(insertVal, head);
            return head;
        }
        Node curr = head;
        while (true) {
            if(curr.val == insertVal) {
                Node next = curr.next;
                Node newNode = new Node(insertVal, next);
                curr.next = newNode;
                return head;
            }
            if (curr.val >= curr.next.val) {
                if (insertVal > curr.val && insertVal > curr.next.val
                        || insertVal < curr.val && insertVal < curr.next.val) {
                    Node next = curr.next;
                    Node newNode = new Node(insertVal, next);
                    curr.next = newNode;
                    return head;
                }
            }
            if (insertVal > curr.val && insertVal < curr.next.val) {
                Node next = curr.next;
                Node newNode = new Node(insertVal, next);
                curr.next = newNode;
                return head;
            }

            if (head == curr.next) {
                Node next = curr.next;
                Node newNode = new Node(insertVal, next);
                curr.next = newNode;
                return head;
            }
            curr = curr.next;
        }
    }

    static class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }
}
