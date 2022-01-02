package com.kwolkowski.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)return null;
        ListNode fast = head;
        Set<ListNode> visited = new HashSet<>();
        while(fast.next != null) {
            if(visited.contains(fast)) return fast;
            visited.add(fast);
            fast = fast.next;
        }
        return null;
    }
}
