package com.kwolkowski.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LowestCommonAncestor1650 {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> parents = new HashSet<>();
        while(p != null) {
            parents.add(p);
            p = p.parent;
        }
        while(q != null) {
            if(parents.contains(q)) return q;
            q = q.parent;
        }
        return null;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    };
}
