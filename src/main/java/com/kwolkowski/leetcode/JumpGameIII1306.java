package com.kwolkowski.leetcode;

import java.util.LinkedList;

public class JumpGameIII1306 {
    public static boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        LinkedList<Integer> toVisit = new LinkedList<>();
        toVisit.add(start);
        while(!toVisit.isEmpty()) {
            int curr = toVisit.pop();
            if(curr < 0 || curr >= arr.length || visited[curr]) continue;
            visited[curr] = true;
            if(arr[curr] == 0) return true;

            toVisit.add(curr + arr[curr]);
            toVisit.add(curr - arr[curr]);
        }
        return false;
    }
}
