package com.kwolkowski.leetcode.biweekly66;

import java.util.*;

public class MinimumCostRobot {
    public static int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        PriorityQueue<int[]> toVisit = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        toVisit.add(new int[]{0, startPos[0], startPos[1]});

        int[] currPos;
        int currCost = 0;
        HashMap<String, Integer> visited = new HashMap<>();
        while(!toVisit.isEmpty()) {
            int[] entry = toVisit.poll();
            currCost = entry[0];
            currPos = new int[]{entry[1], entry[2]};
            String key = currPos[0] + "," + currPos[1];
            if(currPos[0] == homePos[0] && currPos[1] == homePos[1]) return currCost;
            if(visited.containsKey(key)) {
                if(visited.get(key) < currCost)
                    continue;
            }
            visited.put(key, currCost);

            int x = currPos[0];
            int y = currPos[1];

            if(x>0) {
                toVisit.add(new int[]{currCost + rowCosts[x-1], x-1, y});
            }
            if(x<rowCosts.length-1) {
                toVisit.add(new int[]{currCost + rowCosts[x+1], x+1, y});
            }
            if(y>0) {
                toVisit.add(new int[]{currCost + colCosts[y-1], x, y-1});
            }
            if(y<colCosts.length-1) {
                toVisit.add(new int[]{currCost + colCosts[y+1], x, y+1});
            }
        }
        return currCost;
    }
}
